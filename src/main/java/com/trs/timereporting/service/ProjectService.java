package com.trs.timereporting.service;

import com.trs.timereporting.domain.Project;

import java.util.List;


/**
 * Created by williamzappasodi on 12/28/15.
 */
public interface ProjectService {


    Project create(Project project);


    List<Project> getAllProjects();

}

