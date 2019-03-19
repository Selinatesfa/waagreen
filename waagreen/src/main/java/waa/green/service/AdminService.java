package waa.green.service;

import waa.green.model.Attendance;
import waa.green.model.Student;

import java.util.Date;
import java.util.List;

public interface AdminService {
	 public List<Attendance> generateReportByEntry(String dateOfEntry);
    public List<Date> findAllEntry();
}