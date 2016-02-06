package com.trs.timereporting.service.impl;

import com.trs.timereporting.service.ProjectService;
import com.trs.timereporting.domain.Project;
import com.trs.timereporting.domain.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by williamzappasodi on 1/10/16.
 */
@Service
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project create(Project project) {

        return projectRepository.create(project);
    }


    @Override
    public List<Project> getAllProjects() {

        return projectRepository.getAllProjects();
    }


}
