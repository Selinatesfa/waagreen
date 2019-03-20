package waa.green.service;

import waa.green.model.Attendance;
import waa.green.model.EntryReportData;

import java.util.List;

public interface AttendanceService {
    List<Attendance> findAttendancesByEntry(long id);
}
