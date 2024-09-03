package com.first.api.TEST_API.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/print")
    public String printHelloWorldFromBrowser() {
        System.out.println("Hello world");
        return "esto lo estas regrensando del endpoint /print";
    }

}
