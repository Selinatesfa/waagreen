package waa.green.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import waa.green.model.Attendance;
import waa.green.model.Course;
import waa.green.model.PercentageExtrapoint;
import waa.green.repository.BlockRepository;
import waa.green.service.AttendanceService;
import waa.green.service.FacultyService;
@Controller
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
	FacultyService facultyservice;
	public void data(Model model) {
		model.addAttribute("block", facultyservice.getAllBlock());
		model.addAttribute("course", facultyservice.getAllCourse());
	}
	@GetMapping("/faculty")
	 public String faculty(Model model, Authentication authentication) {
						model.addAttribute("block", facultyservice.getAllBlock());
		model.addAttribute("course", facultyservice.getAllCourse());
	
		System.out.println(authentication.getDetails());
		 return "faculty/Faculty";
	 }
	
	@GetMapping("/Restfaculty")
	 public @ResponseBody List<PercentageExtrapoint> facultyreport( @RequestParam String course, @RequestParam String block,Model model) {
		List<Attendance> resultlist=facultyservice.generatereportbycourseandblock(facultyservice.findById(Long.parseLong(course)).get(), block);
					for(PercentageExtrapoint pr:facultyservice.calculateextrapoints(resultlist)) {
					}
						 return	 facultyservice.calculateextrapoints(resultlist);
			
	 }
	
	@GetMapping("/facultyreport")
	public String facultyreportpost(@RequestParam("course") String courseId, @RequestParam String block,Model model)
	{	data(model);
			
			List<Attendance> resultlist=facultyservice.generatereportbycourseandblock(facultyservice.findById(Long.parseLong(courseId)).get(), block);
		//if(facultyservice.calculateextrapoints(resultlist)getClass())
			for(PercentageExtrapoint pr:facultyservice.calculateextrapoints(resultlist)) {
					}
			
			 model.addAttribute("percentdata",facultyservice.calculateextrapoints(resultlist));
				//model.addAttribute("result", facultyservice.generatereportbycourseandblock(facultyservice.findById(Long.parseLong(courseId)).get(), block));
			 return "faculty/Faculty";
							
	
	}
			
	
	
}