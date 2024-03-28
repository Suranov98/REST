package com.example.restapiservice_test.controller;

import com.example.restapiservice_test.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.restapiservice_test.model.*;

@Slf4j
@RestController
public class MyController {

    @PostMapping(value = "/feedback")
    public ResponseEntity<Response> feedback(@RequestBody Request request) {
        Response response = Response.builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(request.getSystemTime())
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}