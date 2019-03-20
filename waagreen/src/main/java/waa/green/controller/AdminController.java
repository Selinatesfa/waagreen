package waa.green.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import waa.green.model.Attendance;
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

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("entries", entryservice.findAllEntry());
        return "Admin/generateReportByEntry";
    }

    /*@RequestMapping(value = "/admin", method = RequestMethod.POST)
    public @ResponseBody
    List<Attendance> showReport(@RequestParam("entry") String entry) {
        return entryservice.generateReportByEntry(entry);
    }*/

    @GetMapping("/registration")
    public ModelAndView registration() {
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
