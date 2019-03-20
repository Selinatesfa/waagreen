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
      public void data(Model model) {
        model.addAttribute("entries", entryService.findAllEntry());
    }

    @RequestMapping("/entryreport")
    public String  report(@RequestParam("entry") String monthYear, Model model) {
data(model);
        Entry entry = entryService.findEntryByMonthYear(monthYear);
        List<Attendance> entryReportData= entryService.generateReportByEntry(entry.getId());

        model.addAttribute("percentdata",entryService.calculateextrapoints(entryReportData));
        return "Admin/generateReportByEntry";
    }
}
