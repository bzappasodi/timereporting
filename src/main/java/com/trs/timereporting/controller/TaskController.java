package com.trs.timereporting.controller;

import com.trs.timereporting.domain.Task;
import com.trs.timereporting.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


/**
 * Created by williamzappasodi on 12/28/15.
 */


@Controller

public class TaskController {

    @Autowired
    private TaskService taskService;


    @RequestMapping("/viewtasks")
    public String view(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        model.addAttribute("taskmessage", "View all tasks");
        return "viewtasks";
    }

    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public String task(@ModelAttribute("newTask") Model model, @RequestParam("projectId") String projectId) {
        model.addAttribute("projectId", projectId);
        return "addtasks";
    }


    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public String saveTask(@ModelAttribute("newTask") Task task, Model model, @RequestParam("projectId") @Valid Integer pid, BindingResult result) {
        if (result.hasErrors()) {
            return "addtasks";
        }
        task.setProjectId(pid);
        taskService.create(task);
       // model.addAttribute("success", "Task Successfully Added!");
        return "redirect:/viewtasks";

    }


}
