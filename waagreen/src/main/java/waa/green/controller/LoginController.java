package waa.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import waa.green.model.Role;
import waa.green.model.User;
import waa.green.service.RoleService;
import waa.green.service.UserService;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
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
