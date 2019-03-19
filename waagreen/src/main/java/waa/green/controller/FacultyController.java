package waa.green.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import waa.green.model.Attendance;
import waa.green.repository.BlockRepository;
import waa.green.service.AttendanceService;
import waa.green.service.FacultyService;
@Controller
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
	FacultyService facultyservice;
	
	@GetMapping("/faculty")
	 public String faculty(Model model) {
						model.addAttribute("block", facultyservice.getAllBlock());
		model.addAttribute("course", facultyservice.getAllCourse());
		
		 return "faculty/Faculty";
	 }
	
	@GetMapping("/Restfaculty")
	 public @ResponseBody List<Attendance> facultyreport( @RequestParam String course, @RequestParam String block) {
		
		 return facultyservice.generatereportbycourseandblock(course, block);
	 }
	@GetMapping("/facultyreport")
	public String facultyreportpost(@RequestParam String course, @RequestParam String block,Model model)
	{
		System.out.println(course+ block);
		//model.addAttribute("report", facultyservice.generatereportbycourseandblock(course, block));
		//System.out.println( facultyservice.generatereportbycourseandblock(course, block));
		return "facultyreport";
	}
}
