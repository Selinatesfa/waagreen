package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.*;
import waa.green.repository.AttendanceRepository;
import waa.green.repository.EntryRepository;
import waa.green.service.EntryService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
    @Override
    public List<PercentageExtrapoint> calculateextrapoints(List<Attendance> attendance) {
        double extrapoints=0;
        double percentage=0;
        int possibledays=0;
        List<PercentageExtrapoint> finalreport=new ArrayList<>();
        HashMap<Student,List<Attendance>> hashresult=new HashMap<>();

        for(Attendance attend: attendance) {
            if(!hashresult.containsKey(attend.getStudent())) {

                List<Attendance> list=new ArrayList();
                list.add(attend);
                hashresult.put(attend.getStudent(), list);
            }
            else {
                hashresult.get(attend.getStudent()).add(attend);
            }
        }
        for(Student atendno:	hashresult.keySet()) {
            int count= hashresult.get(atendno).size();

            if((hashresult.get(atendno).get(0)).getBlock().getSession().getType().equals("2 weeks"))
            {
                possibledays+=10;
                percentage= (100*count/possibledays);

            }
            if((hashresult.get(atendno).get(0)).getBlock().getSession().getType().equals("4 weeks"))
            {
                possibledays+=22;
                percentage= (100*count/possibledays);
                            }
            if(percentage>=70 && percentage <80) {
                extrapoints=0.5;
            }
            if(percentage>=80 && percentage <90) {
                extrapoints=1;
            }
            if(percentage>=90 ) {
                extrapoints=1.5;

            }
            finalreport.add(new PercentageExtrapoint(percentage,extrapoints,atendno,count,possibledays));

        }
        return finalreport;
    }

}
