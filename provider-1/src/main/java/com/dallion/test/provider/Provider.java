package com.dallion.test.provider;

import java.util.concurrent.CountDownLatch;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

  public static void main(String[] args) throws InterruptedException {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("spring/dubbo-context-provider.xml");
    context.start();

    System.out.println("dubbo service started");
    new CountDownLatch(1).await();
  }

}
