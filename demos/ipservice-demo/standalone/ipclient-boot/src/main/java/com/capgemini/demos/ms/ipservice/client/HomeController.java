package com.capgemini.demos.ms.ipservice.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() throws Exception {
        return "It works!!!!!!!!";
    }
}
