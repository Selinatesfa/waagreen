package waa.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttendanceController {
    @GetMapping("/attendance")
    public String attendance(){
        return "";
    }
}
