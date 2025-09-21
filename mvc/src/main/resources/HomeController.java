package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String root() {
        System.out.println(">>> called");
        return "index"; // maps to /WEB-INF/views/index.jsp
    }

    @RequestMapping("/home")
    public String homePage() {
        System.out.println("called 2");
        return "index";
    }
}
