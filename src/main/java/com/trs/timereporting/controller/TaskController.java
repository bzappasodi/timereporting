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
    public String task(@ModelAttribute("newTask") Task task, Model model, @RequestParam("projectId") String projectId) {
        model.addAttribute("projectId", projectId);
        return "addtasks";
    }


    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public String saveTask(@ModelAttribute("newTask") @Valid Task task, BindingResult result) {
        if (result.hasErrors()) {
            return "addtasks";
        }
        //task.setProjectId(pid);
        taskService.create(task);
        return "redirect:/viewtasks";

    }


}
