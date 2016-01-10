package com.trs.timereporting.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trs.timereporting.service.UserService;
import com.trs.timereporting.domain.User;

@Controller
public class UserController {

   @Autowired
  private UserService userService;

    // route to login form
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }


    @RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
    public String loginerror(Model model) {
        model.addAttribute("error", "true");

        return "login";
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(Model model) {

        return "login";
    }

    // submit create account

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String saveUser(User user, Model model){
        userService.create(user);
        model.addAttribute("success", "User Successfully Added!");
        return "savesuccess";
    }

}