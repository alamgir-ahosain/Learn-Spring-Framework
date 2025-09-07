package com.springcore.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProtoype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/prototype/config.xml");
        // Info2 info = context.getBean("info2", Info2.class);

        // Use prototype in class
        Info2 info1 = context.getBean("customBeanName", Info2.class);
        Info2 info2 = context.getBean("customBeanName", Info2.class);

        System.out.println(info1);
        System.out.println(info2);

        System.out.println("Hash Code info1 instance:" + info1.hashCode());
        System.out.println("Hash Code info2 instance:" + info2.hashCode());

        // Use XML based.
        UseXML u1 = context.getBean("beanUseXML", UseXML.class);
        UseXML u2 = context.getBean("beanUseXML", UseXML.class);

        System.out.println("Hash Code u1 instance:" + u1.hashCode());
        System.out.println("Hash Code u2 instance:" + u2.hashCode());

    }
}
