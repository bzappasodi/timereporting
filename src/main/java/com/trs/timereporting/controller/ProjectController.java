package com.trs.timereporting.controller;

import com.trs.timereporting.service.ClientService;
import com.trs.timereporting.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.trs.timereporting.domain.Project;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by williamzappasodi on 12/28/15.
 */
@Controller
@SessionAttributes("currentSessionUser")


public class ProjectController {


    @Autowired
    private ProjectService projectService;
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    // model
    public String project(@ModelAttribute("project") Project project, Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        return "addprojects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute("project") @Valid Project project, BindingResult result, HttpServletRequest request) {

        if (result.hasErrors()) {

            return "addprojects";
        }
        projectService.create(project);
        return "redirect:/viewprojects";
    }
    /*

    @RequestMapping(value = "/addprojects", method = RequestMethod.GET)

    public String project(@ModelAttribute("newProject") Project project) {

        //  model.addAttribute("addprojectmessage", "Add New Project");
        //  model.addAttribute("clients", clientService.getAllClients());

        return "addprojects";
    }


    @RequestMapping(value = "/addprojects", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute("newProject") @Valid Project project, @RequestParam("clientId") Integer cid, BindingResult result, HttpServletRequest request) {

        if (result.hasErrors()) {
            return "addprojects";
        }
        project.setClientId(cid);
        projectService.create(project);
        //model.addAttribute("success", "Project Successfully Added!");
        return "redirect:/viewprojects";
    }

*/


    @RequestMapping("/viewprojects")
    // model
    public String view(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        model.addAttribute("addprojectmessage", "Current Projects List");
        model.addAttribute("currentSessionUser", true);


        return "viewprojects";
    }

}
