package com.trs.timereporting.domain.repository;

import com.trs.timereporting.domain.Task;

import java.util.List;


/**
 * Created by williamzappasodi on 1/18/16.
 */


public interface TaskRepository {

    Task create(Task task);
    List<Task> getAllTasks();


}
