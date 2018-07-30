package com.madpointer.configurationclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
class Controller {

    @Value("${message}")
    private String message;

    @GetMapping("/")
    String getMessage(){
        return this.message;
    }
}
