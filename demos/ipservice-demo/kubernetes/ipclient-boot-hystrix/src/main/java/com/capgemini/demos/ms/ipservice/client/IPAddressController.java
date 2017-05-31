package com.capgemini.demos.ms.ipservice.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
class IPAddressController {

  private int counter;

  @Autowired
  private Config config;

  @RequestMapping(value = "/ip", method = RequestMethod.GET)
  @HystrixCommand(fallbackMethod = "localIP")
  public IPAddress ipaddress() throws Exception {
    RestTemplate template = new RestTemplate();
    return template.getForEntity(config.getServerUrl(), IPAddress.class).getBody();
  }

  public IPAddress localIP() throws UnknownHostException {
    return new IPAddress(++counter, InetAddress.getLocalHost().getHostAddress(),
        config.getMessage());
  }
}
