package net.imwork.zhanlong.spring3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest
{
    public static void main(String[] args)
    {
        //spring方式创建对象
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring3-config.xml"));
        BeanFactory factory = new ClassPathXmlApplicationContext("spring3-config.xml");

        Person person = factory.getBean("chinese3",Person.class);
        person.work();
    }
}
