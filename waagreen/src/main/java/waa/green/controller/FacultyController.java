package waa.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/faculty")
public class FacultyController {
	@GetMapping("/faculty")
	 public String faculty() {
		 return "faculty/Faculty";
	 }
	
}
