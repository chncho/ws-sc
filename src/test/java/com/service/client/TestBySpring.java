package com.service.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Minco
 * Date: 11/12/13
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestBySpring {
    public static void main(String args[]) throws Exception {
        //加载配置
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"client-beans.xml"});
        //获取ws实例
        WebServiceSample client = (WebServiceSample) context.getBean("client");
        String response = client.say("2012");
        System.out.println("Response: " + response);
    }
}
