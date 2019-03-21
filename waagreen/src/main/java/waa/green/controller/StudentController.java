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
import waa.green.model.BlockReportData;
import waa.green.model.Student;
import waa.green.service.AttendanceService;
import waa.green.service.BlockService;
import waa.green.service.StudentService;

import java.util.ArrayList;
import java.util.Date;
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
        model.addAttribute("blockList", blockService.findAllBlocks());
    }

    private static final Log logger = LogFactory.getLog(StudentController.class);

    @GetMapping("/student")
    public String viewProfileModel(Model model) {
        data(model);
        return "student/StudentDetails";
    }

    @GetMapping("/studentDetails")
    public String showForm(@RequestParam("block") String block, Model model, Authentication authentication) {
        String email = authentication.getName();
        Student stud = studentService.findByEmail(email);
        List<Attendance> resultlist = studentService.generatereportbyblock(stud.getId(), block);
        // Block bl = blockService.getBlockByNumnerOfBlock(block);
        //  List<BlockReportData> blockReportDatas= blockService.getBlockReportData(bl, stud);
        model.addAttribute("result", studentService.calculateextrapoints(resultlist));
        //  model.addAttribute("blockReportDatas", blockReportDatas);

        Block bl = blockService.getBlockByNumnerOfBlock(block);
        List<BlockReportData> blockReportDatas = blockService.getBlockReportData(bl, stud);

        model.addAttribute("blockReportDatas", blockReportDatas);
        return "student/Student";
    }
}