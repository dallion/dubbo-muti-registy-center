package com.dallion.test.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dallion.test.api.HelloService;

public class Consumer {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("spring/dubbo-context-consumer.xml");
    context.start();
    HelloService service = context.getBean("helloService", HelloService.class);

    while (true) {
      String hello = service.sayHello("consumer - 1");
      System.out.println("result: " + hello);
      
      try {
        Thread.currentThread().sleep(1000);
      } catch (InterruptedException e) {

      }
    }
  }
}
