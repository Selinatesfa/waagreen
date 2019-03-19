package waa.green.service;

import waa.green.model.Attendance;
import waa.green.model.Entry;

import java.util.Date;
import java.util.List;

public interface EntryService {
    public List<Attendance> generateReportByEntry(String monthYear);
    public List<Entry> findAllEntry();
}
