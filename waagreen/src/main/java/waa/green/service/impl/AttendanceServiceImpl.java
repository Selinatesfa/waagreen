package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import waa.green.model.Attendance;
import waa.green.repository.AttendanceRepository;
import waa.green.service.AttendanceService;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    AttendanceRepository attendanceRepository;
    @Override
    public List<Attendance> findAttendancesByEntry(long id) {
        return attendanceRepository.generateReportByEntry(id);
    }

    @Override
    public List<Attendance> attendancesByStudentId(Long id) {
        return attendanceRepository.findAttendanceByStudentId(id,2L);

    }
}
