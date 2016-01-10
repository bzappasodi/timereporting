package com.trs.timereporting.controller;

import com.trs.timereporting.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trs.timereporting.service.ClientService;
import org.springframework.web.bind.annotation.RequestMethod;

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


    @RequestMapping("/addclients")

    public String add(Model model) {
        model.addAttribute("addclientsmsg", "Add new client");
        return "addclients";
    }



    @RequestMapping(value = "/addclient", method = RequestMethod.POST)
    public String saveClient(Client client, Model model){
        clientService.create(client);
        model.addAttribute("success", "Client Successfully Added!");
        return "savesuccess";
    }

}
