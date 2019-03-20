package waa.green.controller;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.apache.commons.logging.Log;
import waa.green.model.Block;
import waa.green.model.Student;
import waa.green.service.AttendanceService;
import waa.green.service.BlockService;
import waa.green.service.StudentService;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {

    private static final Log logger = LogFactory.getLog(StudentController.class);

    @Autowired
    private StudentService studentService;

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private BlockService blockService;

    @GetMapping("/student")
    public String viewProfile(@ModelAttribute("student")Student student, Model model){
        List<Block> blockList = blockService.findAllBlocks();
        model.addAttribute("blockList",blockList);
       // attendanceService
        return "student/Student";
    }

    @GetMapping("/student/studentDetails")
    public String showForm(){

        return "student/StudentDetails";
    }
}
