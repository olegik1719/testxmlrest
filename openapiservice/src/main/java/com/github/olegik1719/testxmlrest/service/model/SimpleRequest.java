package com.github.olegik1719.testxmlrest.service.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleRequest")
public class SimpleRequest {
    @XmlElement(required = true)
    private String id;
    @XmlElement(required = true)
    private String data;

    public SimpleRequest id(String val){
        id = val;
        return this;
    }

    public SimpleRequest data(String val){
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
