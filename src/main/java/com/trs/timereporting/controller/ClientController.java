package com.trs.timereporting.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.trs.timereporting.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.trs.timereporting.service.ClientService;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by williamzappasodi on 12/28/15.
 */

@Controller
public class ClientController {


    @Autowired
    private ClientService clientService;

    // route to login form
    @RequestMapping("/client")

    public String clients() {
        return "clients";
    }

    @RequestMapping("/clients")
    public String list(Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        return "clients";
    }


    @RequestMapping(value = "/addnewclients", method = RequestMethod.GET)
    public String add(@ModelAttribute("newClient")
                              Client newClient) {
        return "addclients";
    }


    @RequestMapping(value = "/addnewclients", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("newClient") @Valid Client client, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "addclients";
        }
        clientService.create(client);
        return "redirect:/clients";
    }

}
