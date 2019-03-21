package waa.green.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import waa.green.exception.FileTypeExceptionHandler;
import waa.green.model.Attendance;
import waa.green.model.AttendanceFormData;
import waa.green.service.AttendanceService;
import waa.green.validation.FileValidator;
import java.util.ArrayList;
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
    List<Attendance> registerAttendances(AttendanceFormData attendanceFormData, BindingResult bindingResult) {
        FileValidator fileValidator = new FileValidator();
        fileValidator.validate(attendanceFormData, bindingResult);
        String[] suppressedFields = bindingResult.getSuppressedFields();
        if (suppressedFields.length > 0 || bindingResult.hasErrors()) {
            throw new FileTypeExceptionHandler(bindingResult);
        }

        List<Attendance> attendances = new ArrayList<>();
        if (attendanceFormData != null) {
            System.out.println("Files: " + attendanceFormData.getFiles().size());
            for (MultipartFile file : attendanceFormData.getFiles()) {
                attendances.addAll(attendanceService.registerAttendances(file));
            }
        }
        System.out.println("attendances: " + attendances.size());
        return attendances;
    }
}