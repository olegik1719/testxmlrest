package com.github.olegik1719.testxmlrest.service.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleResponse")
public class SimpleResponse {
    @XmlElement(required = true)
    private String id;
    @XmlElement(required = true)
    private String data;

    public SimpleResponse id(String val){
        id = val;
        return this;
    }

    public SimpleResponse data(String val){
        data = val;
        return this;
    }

    public String getId(){
        return id;
    }

    public String getData(){
        return data;
    }
}