package com.exchange.exchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

  @Autowired
  private Environment environment;
  @GetMapping("/exchange")
  public String portInfo(){
    String port = environment.getProperty("local.server.port");
    System.out.println(port);
    return port;
  }
}
