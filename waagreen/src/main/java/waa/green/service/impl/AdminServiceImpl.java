package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Student;
import waa.green.repository.AttendanceRepository;
import waa.green.repository.StudentRepository;
import waa.green.service.AdminService;
import  waa.green.model.Attendance;

import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AttendanceRepository attendanceRepository;
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Attendance> generateReportByEntry(Date dateOfEntry) {
        return attendanceRepository.generateReportByEntry(dateOfEntry);
    }
        public List<Date> findAllEntry() {
        return (List<Date>) studentRepository.findallDateOfEntry();
    }
}
