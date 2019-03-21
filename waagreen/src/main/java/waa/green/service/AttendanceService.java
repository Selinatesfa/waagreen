package waa.green.service;

import org.springframework.web.multipart.MultipartFile;
import waa.green.model.Attendance;
import waa.green.model.AttendanceFormData;
import java.util.Date;
import java.util.List;

public interface AttendanceService {
    List<Attendance> attendancesByStudentId(Long id);

    List<Attendance> findAttendancesByEntry(long id);

    List<Attendance> registerAttendances(MultipartFile file);
    List<Attendance> registerAttendances(AttendanceFormData attendanceFormData);
    Attendance findAttendanceForBlockReport(long block_id, long student_id, Date date);
}

