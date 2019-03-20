package waa.green.service;

import waa.green.model.Attendance;


import java.util.List;


public interface AttendanceService {
    List<Attendance> findAttendancesByEntry(long id);
}
