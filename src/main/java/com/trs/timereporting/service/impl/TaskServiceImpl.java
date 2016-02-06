package com.trs.timereporting.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trs.timereporting.domain.Task;
import com.trs.timereporting.domain.repository.TaskRepository;
import com.trs.timereporting.service.TaskService;

import java.util.List;

/**
 * Created by williamzappasodi on 1/18/16.
 */
@Service
public class TaskServiceImpl implements TaskService{



    @Autowired
    private  TaskRepository taskRepository;

    @Override
    public Task create(Task task) {

        return taskRepository.create(task);
    }


    @Override
    public List<Task> getAllTasks() {

        return taskRepository .getAllTasks();
    }


}
