package waa.green.controller;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import waa.green.model.Block;
import waa.green.model.Student;
import waa.green.service.BlockService;
import waa.green.service.StudentService;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/student")
public class Studentcontroller {

    private static final Log logger = LogFactory.getLog(Studentcontroller.class);

    @Autowired
    private StudentService studentService;

    @Autowired
    private BlockService blockService;

    @GetMapping("/student")
    public String viewProfile(@ModelAttribute("student")Student student, Model model){
        List<Block> blockList = blockService.findAllBlocks();
        model.addAttribute("blockList",blockList);
        return "student/Student";
    }
//    @PostMapping("/saveStudent")
//    public String processStudentInfo(@ModelAttribute("student") Student student, Model model, RedirectAttributes redirectAttributes){
//        model.addAttribute("student",student);
//
//        return "redirect:student/StudentDetails";
//    }

    @GetMapping("/StudentDetails")
    public String showForm(){

        return "student/StudentDetails";
    }
}
