package com.github.olegik1719.testxmlrest.service.rest;

import com.github.olegik1719.testxmlrest.service.model.SimpleRequest;
import com.github.olegik1719.testxmlrest.service.model.SimpleResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleService {

    @PostMapping(value = "/api/post"
            , produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
            , consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public SimpleResponse makeResponse(@RequestBody SimpleRequest body) {
        return new SimpleResponse()
                .id("Request: " + body.getId())
                .data("Request: " + body.getData());
    }

    @GetMapping(value = "/api/get", produces = {MediaType.APPLICATION_XML_VALUE})
    public SimpleResponse makeResponse() {
        return new SimpleResponse()
                .id("Get: ID")
                .data("Get: Data");
    }
}
