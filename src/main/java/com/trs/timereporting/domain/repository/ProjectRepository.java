package com.trs.timereporting.domain.repository;

import com.trs.timereporting.domain.Project;

import java.util.List;

/**
 * Created by williamzappasodi on 1/10/16.
 */
public interface ProjectRepository {


    Project create(Project project);
    List<Project> getAllProjects();

}
