package com.capgemini.demos.ms.ipservice.eureka;

import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class IPAddressController {
    private int counter;

    @Autowired
    private Config config;

    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public IPAddress ipaddress() throws Exception {
        return new IPAddress(++counter, InetAddress.getLocalHost().getHostAddress(), config.getMessage());
    }
}
