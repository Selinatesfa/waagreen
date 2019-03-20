package waa.green.controller;

import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.RequestParam;
import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.Student;
import waa.green.service.AttendanceService;
import waa.green.service.BlockService;
import waa.green.service.StudentService;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {
	 @Autowired
	    private StudentService studentService;

	    @Autowired
	    private AttendanceService attendanceService;

	    @Autowired
	    private BlockService blockService;

public void data(Model model) {
	model.addAttribute("blockList",blockService.findAllBlocks());
	 
}
    private static final Log logger = LogFactory.getLog(StudentController.class);

   
    @GetMapping("/student")
    public String viewProfileModel(Model model){
                 data(model);
                 
        return "student/StudentDetails";}

    public String viewProfile(@ModelAttribute("student") Student student, Model model) {

        return "student/Student";
    }

    @GetMapping("/studentDetails")
    public String showForm(@RequestParam("block") String block,Model model,Authentication authentication){
    	String email=authentication.getName();
    	model.addAttribute("result", studentService.generatereportbyblock(email,block)); 
    	 return "student/Student";	
    }  	

//    @GetMapping("/student/detail")
//    public String form(Model model){
//        List<Block> blockList = blockService.findAllBlocks();
//        model.addAttribute("blockList", blockList);
//      return "student/StudentDetails";
//    }

    @GetMapping("/student/studentDetails")
    public String showForm(@RequestParam() Long blockId, Model model) {
        List<Block> blockList = blockService.findAllBlocks();
        model.addAttribute("blockList", blockList);
        List<Attendance> attendanceList = attendanceService.attendancesByStudentId(blockId);
        model.addAttribute("attendanceList", attendanceList);
        return "student/StudentDetails";
    }


}
