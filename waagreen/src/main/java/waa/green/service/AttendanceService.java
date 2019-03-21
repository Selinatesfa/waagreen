package waa.green.service;

import waa.green.model.Attendance;
import waa.green.model.AttendanceFormData;
import waa.green.model.EntryReportData;

import java.util.List;


public interface AttendanceService {
    List<Attendance> attendancesByStudentId(Long id);

    List<Attendance> findAttendancesByEntry(long id);
    List<Attendance> registerAttendances(AttendanceFormData attendanceFormData);
}

