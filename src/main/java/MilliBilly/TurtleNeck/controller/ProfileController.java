package MilliBilly.TurtleNeck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
    @GetMapping("profile")
    public String getProfile(Model model) {
        model.addAttribute("member");
        return "profile";
    }
}