package waa.green.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import waa.green.model.Attendance;
import waa.green.model.User;
import waa.green.service.AttendanceService;
import waa.green.service.StudentService;
import waa.green.service.UserService;
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	UserService userService;
	@Autowired
	AttendanceService attendanceService;

	@RequestMapping("/admin")
	public String admin(){
		ModelAndView modelAndView = new ModelAndView();
		return "generateReportByEntry";
	}
	@RequestMapping(value="/admin", method= RequestMethod.POST)
	public String showReport(@Valid Attendance attendance,BindingResult result) {
		//Attendance atendance = attendanceService.generateReportByEntry();
		return "generateReportByEntry";
	}
	 @GetMapping("/registration")
	    public ModelAndView registration(){	
		 ModelAndView modelAndView = new ModelAndView();
//	        modelAndView.addObject("user", user);
//	        modelAndView.setViewName("registration");
	        return modelAndView;
	    }

	    @PostMapping(value = "/registration")
	    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
	        ModelAndView modelAndView = new ModelAndView();
	        User userExists = userService.findUserByEmail(user.getEmail());
	        if (userExists != null) {
	            bindingResult
	                    .rejectValue("email", "error.user",
	                            "There is already a user registered with the email provided");
	        }
	        if (bindingResult.hasErrors()) {
	            modelAndView.setViewName("registration");
	        } else {
	            userService.saveUser(user);
	           // modelAndView.addObject("successMessage", "User has been registered successfully");
	            //modelAndView.addObject("user", new User());
	            modelAndView.setViewName("/login");
	        }
	        return modelAndView;
	    }
}
