package net.imwork.zhanlong.spring4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
    public static void main(String[] args)
    {
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring4-config.xml"));
        BeanFactory factory = new ClassPathXmlApplicationContext("spring4-config.xml");

        Person chinese = factory.getBean("chinese4",Person.class);
        chinese.test();


    }
}
