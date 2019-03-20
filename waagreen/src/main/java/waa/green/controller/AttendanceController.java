package waa.green.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import waa.green.model.Attendance;
import waa.green.model.AttendanceFormData;
import waa.green.service.AttendanceService;

import java.util.List;

@Controller
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;

    @GetMapping("/attendance")
    public String attendance() {
        return "components/attendance";
    }

    @PostMapping("/attendance")
    public @ResponseBody
    List<Attendance> registerAttendances(AttendanceFormData attendanceFormData) {
        List<Attendance> attendances = attendanceService.registerAttendances(attendanceFormData);
        System.out.println("New Attendances: " + attendances.size());
        return attendances;
    }
}