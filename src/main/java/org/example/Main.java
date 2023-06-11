package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scala.collection.mutable.ListBuffer;

import javax.servlet.ServletException;


// MergeBase: NON-Vulnerable Versions of Java Libraries for GRADLE
public class Main {
    public static void main(String[] args) throws ServletException {
        // Uses Log4j 2.20.0
        final Logger logger = LogManager.getLogger();
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        // Uses Apache Tomcat 9.0.54
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/", "helloServlet");

        // Uses Scala Library 2.13.11-M2
        ListBuffer<Integer> list = new ListBuffer<>();
        list.$plus$eq(1);
        list.$plus$eq(2);
        list.$plus$eq(3);
        list.$plus$eq(4);
        list.$plus$eq(5);
        System.out.println(list.mkString(", "));

        // Uses Spring Framework 5.3.8

        try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MyBean.class)) {
            MyBean myBean = appContext.getBean(MyBean.class);
            myBean.sayHello();
        }

        // Program also uses Apache Maven 3.9.0 and Logback 1.4.7 but usages omitted
    }


}