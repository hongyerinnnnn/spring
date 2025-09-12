package com.multi.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model){
        model.addAttribute("msg", "Spring Legacy (XML) running!");
        return "home"; // /WEB-INF/views/home.jsp
    }
    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("msg", "Hi...");
        return "hi";
    }
    @GetMapping("/edutest")
    public String eduTest(Model model){
        // 비즈니스로직을 수행하는 부분


        return "edutest";//view name
    }

}

