package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Attendance;
import waa.green.model.Entry;
import waa.green.model.EntryReportData;
import waa.green.repository.AttendanceRepository;
import waa.green.repository.EntryRepository;
import waa.green.service.EntryService;

import java.util.Date;
import java.util.List;
@Service
public class EntryServiceImpl implements EntryService {
    @Autowired
    AttendanceRepository attendanceRepository;
    @Autowired
    EntryRepository entryRepository;

    @Override
    public List<Attendance> generateReportByEntry(Long entryId) {
        return attendanceRepository.generateReportByEntry(entryId);
    }
    public List<Entry> findAllEntry() {

        return (List<Entry>) entryRepository.findAll();
    }

    @Override
    public Entry findByID(Long id) {
        return entryRepository.findById(id).get();
    }

    @Override
    public Entry findEntryByMonthYear(String monthYear) {
        return entryRepository.findEntryByMonthYear(monthYear);
    }
}
