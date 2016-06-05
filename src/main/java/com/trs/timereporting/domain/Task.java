package com.trs.timereporting.domain;


import org.hibernate.validator.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by williamzappasodi on 1/18/16.
 */

@XmlRootElement


public class Task {

    private Integer projectId;
    private Integer taskId;
    @NotEmpty(message="{NotNull.Project.hours.validation}")
    private String hoursAdded;
    @NotEmpty(message="{NotNull.Project.description.validation}")
    private String description;
    @NotEmpty(message="{NotNull.Project.hours.validation}")
    private String hours;
    private String projectDescription;

    public Task() {

    }


    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getHoursAdded() {
        return hoursAdded;
    }

    public void setHoursAdded(String hoursAdded) {
        this.hoursAdded = hoursAdded;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
}
