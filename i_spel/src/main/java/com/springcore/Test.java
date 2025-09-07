package com.springcore;

import org.springframework.expression.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
        // Info2 info = context.getBean("info2", Info2.class);
        A info = context.getBean("customA", A.class);
        System.out.println(info);

        // Class
        SpelExpressionParser obj = new SpelExpressionParser();
        Expression exp = (Expression) obj.parseExpression("10+2");
        try {
            System.out.println(exp.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}