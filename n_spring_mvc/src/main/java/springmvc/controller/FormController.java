package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class FormController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void util(Model model){
        model.addAttribute("country","Bangladesh");
        model.addAttribute("university","MBSTU");
    }

    @GetMapping("/registration")
    public String registrationForm(){
        return "registration";
    }

    @PostMapping("/submit")
    public String handleFormSubmit(@ModelAttribute User user){
        userService.createUser(user);
        return "login";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
}
