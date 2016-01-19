package com.trs.timereporting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by williamzappasodi on 12/28/15.
 */
@Controller
public class ProjectController {

    @RequestMapping("/projects")
    // model
    public String project(Model model) {
        model.addAttribute("addprojectmessage", "Add New Project");
        return "projects";
    }



    @RequestMapping(value = "/addproject", method = RequestMethod.POST)
    public String saveProject(Project project, Model model){
        projectService.create(project);
        model.addAttribute("success", "Project Successfully Added!");
        return "savesuccess";
    }



}
