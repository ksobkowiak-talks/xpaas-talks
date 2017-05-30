package com.capgemini.demos.ms.ipservice.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class IPAddressController {

    @Autowired
    private Config config;

    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public IPAddress ipaddress() throws Exception {
        RestTemplate template = new RestTemplate();
        return template.getForEntity(config.getServerUrl(), IPAddress.class).getBody();
    }
}
