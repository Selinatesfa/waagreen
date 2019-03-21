package waa.green.service;

import org.springframework.web.multipart.MultipartFile;
import waa.green.model.Attendance;
import waa.green.model.AttendanceFormData;
import waa.green.model.EntryReportData;

import java.util.List;


public interface AttendanceService {
    List<Attendance> attendancesByStudentId(Long id);

    List<Attendance> findAttendancesByEntry(long id);

    List<Attendance> registerAttendances(MultipartFile file);
}
