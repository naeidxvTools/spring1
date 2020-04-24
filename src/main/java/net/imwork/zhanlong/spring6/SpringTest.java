package net.imwork.zhanlong.spring6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class SpringTest
{
    public static void main(String[] args)
    {

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring6-config.xml"));
        BeanFactory factory = new ClassPathXmlApplicationContext("spring6-config.xml");
//        ProxyFactoryBean p = factory.getBean("&person6",ProxyFactoryBean.class); // 生成的是ProxyFactoryBean的对象
//        System.out.println(p.getClass());
//        Person person = factory.getBean("person6", Person.class);
//        System.out.println(person.getClass());
//        person.eat();
//        person.sleep();
//
//        System.out.println("=================");
//        factory.getBean("personTarget6", Person.class).eat();

        Dog dog = (Dog) factory.getBean("dog");
        System.out.println(dog.getClass().getName());
        try
        {
            dog.remove();
        } catch (Exception e)
        {
        }

        try
        {
            dog.save();
        } catch (SQLException throwables)
        {
        }

    }
}
