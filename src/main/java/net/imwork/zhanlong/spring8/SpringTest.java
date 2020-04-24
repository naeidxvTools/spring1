package net.imwork.zhanlong.spring8;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
    public static void main(String[] args)
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring8-config.xml");

        Operation operation = factory.getBean("operation", Operation.class);

        operation.update();
        operation.view();


    }
}
