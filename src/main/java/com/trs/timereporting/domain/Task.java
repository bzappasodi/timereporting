package com.trs.timereporting.domain;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by williamzappasodi on 1/18/16.
 */

@XmlRootElement


public class Task {

    private Integer projectId;
    private Integer taskId;
    private String hoursAdded;
    private String description;
    private String hours;

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
}
