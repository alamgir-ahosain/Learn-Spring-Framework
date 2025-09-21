package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
    public class HomeController {


    //use Model to send data (Controller to View)
    @GetMapping("/a")
    public String useModel(Model model) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        model.addAttribute("fruits",fruits);
        model.addAttribute("name","Alamgir Hosain");

        return "modelView";
    }


    //use ModelAndView to send data (Controller to View)
    @GetMapping("/b")
    public ModelAndView useModelAndView() {

        ModelAndView modelAndView=new ModelAndView(); //creating modelAndView Object

        List<String> fruits=new ArrayList<>();
        fruits.add("update");
        fruits.add("Alamgir");
        modelAndView.addObject("fruits",fruits);
        modelAndView.addObject("name","Alamgir Hosain"); //setting data

        modelAndView.setViewName("modelAndView"); //set view name
        return  modelAndView;

    }
}

