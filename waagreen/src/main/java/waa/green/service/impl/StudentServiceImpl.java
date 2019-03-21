package waa.green.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.*;
import waa.green.repository.AttendanceRepository;
import waa.green.repository.BlockRepository;
import waa.green.repository.StudentRepository;
import waa.green.service.BlockService;
import waa.green.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    AttendanceRepository attendacerepositort;
    @Autowired
    StudentRepository studentservice;

    @Override
    public List<Attendance> generatereportbyblock(Long studentid, String block) {

        return attendacerepositort.generatereportbyblock(studentid, block);
    }

    @Autowired
    StudentRepository studentRepository;

    	@Autowired
	BlockService blockService;
    @Override
    public Student getStudentByCode(String code) {
        return studentRepository.getByCodeBarcode(code);
    }

    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return studentRepository.getStudentByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Student findByEmail(String email) {

        return studentservice.findByEmail(email);
    }

    @Override
    public StudentReportDate calculateextrapoints(List<Attendance> attendance) {
        double percentage = 0;
        int canceldays = 0;
        int possibledays = 0;
        Date meditationdates;
        String blocktype = "";
        int count = 0;

List<Date> result=new ArrayList<>();
        for (Attendance atendno : attendance) {
            count = attendance.size();
            canceldays = atendno.getBlock().getCanceledDays();
            blocktype = atendno.getBlock().getSession().getType();


        System.out.println(count + "++++++" + blocktype);
        if (blocktype.equals("2 weeks")) {
            int totaldays = 10 - canceldays;
            percentage = (100 * count / totaldays);
            possibledays = 10;
            System.out.println(count + "++++++" + percentage + "2week");
        }
        if (blocktype.equals("4 weeks")) {
            int totaldays = 22 - canceldays;
            percentage = (100 * count / totaldays);
            possibledays = 22;
            System.out.println(count + "++++++" + percentage + "4week");

        }

result.add(atendno.getAttendanceDate());
        }

        StudentReportDate lastreport= new StudentReportDate(percentage,possibledays,count);
        lastreport.setDateofmed(result);
        lastreport.setAvailable(true);

        return lastreport;
    }


}
