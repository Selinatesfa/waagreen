package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.*;
import waa.green.repository.AttendanceRepository;
import waa.green.repository.EntryRepository;
import waa.green.service.EntryService;

import java.util.*;

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
        return entryRepository.findAll();
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
        double extrapoints = 0;
        double percentage = 0;
        int possibledays = 0;
        Set<Course> studentcourse = new HashSet<>();
        int noblocks = 0;
        // Student studentid;
        List<PercentageExtrapoint> finalreport = new ArrayList<>();
        HashMap<Student, List<Attendance>> hashresult = new HashMap<>();
        for (Attendance attend : attendance) {
            if (!hashresult.containsKey(attend.getStudent())) {

                List<Attendance> list = new ArrayList();
                list.add(attend);
                hashresult.put(attend.getStudent(), list);
            } else {
                hashresult.get(attend.getStudent()).add(attend);
            }
        }
        for (Student atendno : hashresult.keySet()) {
            extrapoints = 0;
            noblocks = 0;
            percentage = 0;
            studentcourse = hashresult.get(atendno).get(0).getStudent().getCourses();
            int count = hashresult.get(atendno).size();


            List<Course> studentcourselist = new ArrayList<>(studentcourse);
            for (Course cors : studentcourselist) {
                List<Block> bl = new ArrayList<>(cors.getBlocks());
                if (bl.get(0) != null) {


                    if (bl.get(0).getSession().getType().equals("2 weeks")) {
                        System.out.println(noblocks + "2");
                        noblocks = noblocks + 10;
                    }
                    if (bl.get(0).getSession().getType().equals("4 weeks")) {
                        noblocks = noblocks + 22;
                        System.out.println(noblocks + "4");
                    }
                }
            }
            if (noblocks == 0)
                break;
            ;
            if ((hashresult.get(atendno).get(0)).getBlock().getSession().getType().equals("2 weeks")) {
                percentage = (100 * count / noblocks);

            }
            if ((hashresult.get(atendno).get(0)).getBlock().getSession().getType().equals("4 weeks")) {
                percentage = (100 * count / noblocks);
            }
            if (percentage >= 70 && percentage < 80) {
                extrapoints = 0.5;
            }
            if (percentage >= 80 && percentage < 90) {
                extrapoints = 1;
            }
            if (percentage >= 90) {
                extrapoints = 1.5;
            }
            finalreport.add(new PercentageExtrapoint(percentage, extrapoints, atendno, count, noblocks));
        }
        return finalreport;
    }

}
