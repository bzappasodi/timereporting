package com.trs.timereporting.domain;



import org.hibernate.validator.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {

    @NotEmpty(message="{NotNull.Client.name.validation}")
    private String name;

    @NotEmpty(message="{NotNull.Client.address.validation}")
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
