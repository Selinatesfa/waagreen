package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Attendance;
import waa.green.model.Entry;
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
    public List<Attendance> generateReportByEntry(String monthYear) {
        return attendanceRepository.generateReportByEntry(monthYear);
    }
    public List<Entry> findAllEntry() {

        return (List<Entry>) entryRepository.findAll();
    }
}
