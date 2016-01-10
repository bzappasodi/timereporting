package com.trs.timereporting.domain;

/**
 * Created by williamzappasodi on 1/1/16.
 */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {

    private String name;
    private String address;
    private Integer clientId;

    public Client() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
