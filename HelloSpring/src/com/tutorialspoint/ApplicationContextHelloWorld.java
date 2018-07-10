package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextHelloWorld {


public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext
         ("C:\\CSI\\Beans/Beans.xml");
      
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
   }
}