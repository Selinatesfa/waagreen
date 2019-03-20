package waa.green.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import waa.green.model.Attendance;
import waa.green.model.Entry;
import waa.green.model.Student;
import waa.green.service.AttendanceService;
import waa.green.service.EntryService;
import waa.green.service.FacultyService;
import waa.green.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class EntryController {
    @Autowired
    EntryService entryService;
    @Autowired
    AttendanceService attendanceService;
    @Autowired
    FacultyService fs;

    /*@GetMapping("/entry/report")
    public String findReport(@RequestParam("entry") long entryId, Model model) {
        Entry entry = entryService.findByID(entryId);
        List<Attendance> attendances = new ArrayList<>();
*//*        if(entry!= null)
            attendances = attendanceService.findAttendancesByEntry(entryId);*//*

        model.addAttribute("entries", entryService.findAllEntry());
        model.addAttribute("attendances", attendances);
        model.addAttribute("entryId", entryId);

        return "Admin/generateReportByEntry";
    }*/
    @RequestMapping("/entryreport")
    public String  report(@RequestParam("entry") String monthYear, Model model) {
        /*for(Attendance a:entryService.generateReportByEntry(entry) ){
            System.out.println(a);
        }*/
        Entry entry = entryService.findEntryByMonthYear(monthYear);
        List<Attendance> entryReportData= entryService.generateReportByEntry(entry.getId());
      //  List<EntryReportData> entryReportData1 = new ArrayList();
        System.out.println("entryReportData: " + entryReportData.size());
        model.addAttribute("entries", entryService.findAllEntry());
        //model.addAttribute("report",entryService.generateReportByEntry(entry.getId()));
                //System.out.print(entryService.generateReportByEntry(entry));
        return "Admin/generateReportByEntry";
    }
}
