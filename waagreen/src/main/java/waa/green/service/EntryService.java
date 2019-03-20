package waa.green.service;

import waa.green.model.Attendance;
import waa.green.model.Entry;
import waa.green.model.PercentageExtrapoint;

import java.util.Date;
import java.util.List;

public interface EntryService {
    public List<Attendance> generateReportByEntry(Long entryId);
    public List<Entry> findAllEntry();
    Entry findByID(Long id);
    Entry findEntryByMonthYear(String monthYear);
    public List<PercentageExtrapoint> calculateextrapoints(List<Attendance> attendance);
}
