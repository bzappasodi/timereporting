package com.trs.timereporting.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by williamzappasodi on 1/10/16.
 *
 * A domain model is a representation of the data storage types required by the business logic.
 */

@XmlRootElement

public class Project {
    private String hours;
    private String startDate;
    private String dueDate;
    private String name;
    private String invoiceSent;
    private Integer clientId;
    private Integer projectId;
    private String description;


    public Project() {

    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String client) {
        this.name = client;
    }

    public String getInvoiceSent() {
        return invoiceSent;
    }

    public void setInvoiceSent(String invoiceSent) {
        this.invoiceSent = invoiceSent;
    }




    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
