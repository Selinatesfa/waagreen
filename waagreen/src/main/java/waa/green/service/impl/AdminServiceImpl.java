package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.repository.AttendanceRepository;
import waa.green.service.AdminService;
import  waa.green.model.Attendance;

import java.util.Date;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AttendanceRepository attendanceRepository;

    @Override
    public Attendance generateReportByEntry(Date dateOfEntry) {
        return attendanceRepository.generateReportByEntry(dateOfEntry);
    }
}
