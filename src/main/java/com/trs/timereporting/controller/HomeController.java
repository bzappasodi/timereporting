package com.trs.timereporting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // logical view name
    @RequestMapping("/")
    // model
    public String welcome(Model model) {
        // Adding these key values to the model or map
        // model.addAttribute works exactly like request.setAttribute.
        model.addAttribute("greeting", "Login");
        model.addAttribute("tagline", "The one and only amazing TRS");
        // return value of the welcome method
        return "login";
    }



}
