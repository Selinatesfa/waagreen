package waa.green.controller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import waa.green.model.Role;
import waa.green.model.User;
import waa.green.service.RoleService;
import waa.green.service.UserService;
@Controller
public class LoginController {
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleservice;
	
	@GetMapping( "/login" )
    public ModelAndView login(){
		 Role r= new Role();
	        r.setRole("FACULTY");
	        roleservice.saverole(r);
	        Set<Role> rolelist= new HashSet<>();
	        rolelist.add(r);
		User user= new User("Lenny@mum.edu","123456","ss","sss",1,rolelist);
		userService.saveUser(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
 
 @GetMapping("/home")
 public String home() {
	 return "home";
 }
 @GetMapping("/access-denied")
 public String accessdenied() {
	 return "access-denied";
 }
 
	
	    }
