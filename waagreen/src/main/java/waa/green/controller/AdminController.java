package waa.green.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import waa.green.model.Attendance;
import waa.green.model.Role;
import waa.green.model.User;
import waa.green.service.*;

import java.sql.Struct;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserService userService;
    @Autowired
    EntryService entryservice;
    @Autowired
    RoleService roleService;

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("entries", entryservice.findAllEntry());
        return "Admin/generateReportByEntry";
    }

//      @GetMapping("/registration")
//    public String getAddUserForm(@ModelAttribute("user") User user, Model model) {
//		//List<Role> roles = roleService.findrole();
//		//model.addAttribute("roles", roles);
//		return "Admin/registration";
//	}
//
//    @PostMapping(value = "/registration")
//    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
//        ModelAndView modelAndView = new ModelAndView();
//        User userExists = userService.findUserByEmail(user.getEmail());
//        if (userExists != null) {
//            bindingResult
//                    .rejectValue("email", "error.user",
//                            "There is already a user registered with the email provided");
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.setViewName("registration");
//        } else {
//            userService.saveUser(user);
//                       modelAndView.setViewName("/login");
//        }
//        return modelAndView;
//    }
}
