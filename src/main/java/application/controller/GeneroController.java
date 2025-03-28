package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.ui.Model;

@Controller
public class GeneroController {
    @RequestMapping("/")
    @Autowired
    // private 

    // @RequestMapping(value ={"/get", ""})
    // public String select (Model add){
    //     add.addAttribute("generos")
    // }
    public String home() {
        return "home";
    }
}