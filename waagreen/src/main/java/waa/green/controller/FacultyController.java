package waa.green.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import waa.green.model.Course;
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
	 public @ResponseBody List<Attendance> facultyreport( @RequestParam String course, @RequestParam String block,Model model) {
				
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date result;
		try {			
			result = df.parse(block);
					} catch (ParseException e) {
			
			e.printStackTrace();
		}  
		return null;
	 }
	@GetMapping("/facultyreport")
	public String facultyreportpost(@RequestParam("course") String courseId, @RequestParam String block,Model model)
	{	
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date result;
		try {
			result = df.parse(block);
			List<Attendance> resultlist=facultyservice.generatereportbycourseandblock(facultyservice.findById(Long.parseLong(courseId)).get(), result);
				
			System.out.println(facultyservice.findById(Long.parseLong(courseId)).get()+"courseob");
			model.addAttribute("result", facultyservice.generatereportbycourseandblock(facultyservice.findById(Long.parseLong(courseId)).get(), result));
			 return "faculty/facultyreport";
		} catch (ParseException e) {
			
			e.printStackTrace();
		}  
						
		
	 return "faculty/facultyreport";
	}
}