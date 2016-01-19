package com.trs.timereporting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by williamzappasodi on 12/28/15.
 */


@Controller
@RequestMapping(value = "/task")

public class TaskController {


    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public String getProjectId(@PathVariable(value = "projectId") String projectId, Model model) {
        model.addAttribute("projectId",projectId);
        return "task";
    }


}
