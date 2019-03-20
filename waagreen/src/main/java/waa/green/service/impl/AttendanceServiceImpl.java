package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import waa.green.formatter.DateFormatter;
import waa.green.model.Attendance;
import waa.green.model.AttendanceFormData;
import waa.green.repository.AttendanceRepository;
import waa.green.service.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    AttendanceRepository attendanceRepository;
    @Autowired
    DateFormatter dateFormatter;
    @Autowired
    StudentService studentService;
    @Autowired
    LocationService locationService;
    @Autowired
    AttendanceTypeService attendanceTypeService;
    @Autowired
    BlockService blockService;

    @Override
    public List<Attendance> findAttendancesByEntry(long id) {
        return attendanceRepository.generateReportByEntry(id);
    }

    @Override
    public List<Attendance> attendancesByStudentId(Long id) {
        return attendanceRepository.findAttendanceByStudentId(id, 2L);
    }

    @Override
    public List<Attendance> registerAttendances(AttendanceFormData attendanceFormData) {
        List<Attendance> attendances = new ArrayList<>();
        try {
            if (attendanceFormData != null) {
                if (attendanceFormData.getFile() != null) {
                    String str = new String(attendanceFormData.getFile().getBytes(), StandardCharsets.UTF_8);
                    String[] lines = str.split(System.getProperty("line.separator"));
                    for (String line : lines) {
                        String[] columns = line.split(",");
                        if(columns.length == 4)
                            attendances.add(rcData(columns));
                        else
                            attendances.add(manualCheck(columns));
                    }
                } else {
                    System.out.println("file is empty");
                }
            } else {
                System.out.println("attendanceFormData is empty");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return attendances;
    }

    private Attendance rcData(String[] columns) {
        Attendance attendance = new Attendance();
        Date date = dateFormatter.parse(columns[1], null);
        attendance.setAttendanceDate(date);
        attendance.setPeriod(columns[2].trim());
        attendance.setPresent(1);
        attendance.setStudent(studentService.getStudentByCode(columns[0].trim()));
        attendance.setLocation(locationService.getLocationByShortName(columns[3].trim()));
        attendance.setAttendanceType(attendanceTypeService.findById(1));
        return saveAttendance(attendance, date);
    }

    private Attendance manualCheck(String[] columns) {
        Attendance attendance = new Attendance();
        Date date = dateFormatter.parse(columns[0], null);
        attendance.setAttendanceDate(date);
        attendance.setPeriod("AM");
        attendance.setPresent(1);
        String[] name = columns[2].trim().split(" ");
        attendance.setStudent(studentService.getStudentByFirstNameAndLastName(name[0].trim(), name[1].trim()));
        attendance.setLocation(locationService.findById(1));
        attendance.setAttendanceType(attendanceTypeService.findById(1));
        return saveAttendance(attendance, date);
    }
    private Attendance saveAttendance(Attendance attendance, Date date){
        attendance.setBlock(blockService.getBlockBetween(date));
        /*if(attendance.getStudent() != null && attendance.getBlock() != null)
            attendance = attendanceRepository.save(attendance);*/
        return attendance;
    }
}
