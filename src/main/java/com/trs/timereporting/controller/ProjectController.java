package com.trs.timereporting.controller;

import com.trs.timereporting.service.ClientService;
import com.trs.timereporting.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.trs.timereporting.domain.Project;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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


    @RequestMapping("/addprojects")
    // model
    public String project(Model model) {
        model.addAttribute("addprojectmessage", "Add New Project");
        model.addAttribute("clients", clientService.getAllClients());

        return "addprojects";
    }

    @RequestMapping("/viewprojects")
    // model
    public String view(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        model.addAttribute("addprojectmessage", "Current Projects List");
        model.addAttribute("currentSessionUser", true);


        return "viewprojects";
    }


    @RequestMapping(value = "/addproject", method = RequestMethod.POST)
    public String saveProject(Project project, Model model, @RequestParam("clientId") Integer cid) {
        project.setClientId(cid);
        projectService.create(project);
        model.addAttribute("success", "Project Successfully Added!");
        return "savesuccess";
    }


}
