package com.trs.timereporting.service;

import com.trs.timereporting.domain.Task;

import java.util.List;

/**
 * Created by williamzappasodi on 12/28/15.
 */
public interface TaskService {



    Task create(Task task);


    List<Task> getAllTasks();

}
