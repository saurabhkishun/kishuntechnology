package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   
	   int i = 200;
	   int j = 404;
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      
      HelloWorld objWorld = (HelloWorld) context.getBean("byeWorld");
      
      if(j == 404) {
    	  objWorld.getMessage();
      }else {
    	  obj.getMessage();
      }
      
     
   }
}