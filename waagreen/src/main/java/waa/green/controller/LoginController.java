package waa.green.controller;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;;
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

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        Role r = new Role();
        r.setRole("FACULTY");
        roleservice.saverole(r);
        Set<Role> rolelist = new HashSet<>();
        rolelist.add(r);
        User user = new User("Lenny@mum.edu", "123456", "ss", "sss", 1, rolelist);
        userService.saveUser(user);
        model.addAttribute("error", error);
        return "login";
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
