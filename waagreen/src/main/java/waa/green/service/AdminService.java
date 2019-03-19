package waa.green.service;

import waa.green.model.Attendance;

import java.util.Date;

public interface AdminService {
    public Attendance generateReportByEntry(Date dateOfEntry);
}