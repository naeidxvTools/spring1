package net.imwork.zhanlong.spring5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
    public static void main(String[] args)
    {
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring5-config.xml"));
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring5-config.xml");

        Person p = (Person) factory.getBean("chinese5");
        p.work();

//        factory.destroySingletons();
        factory.destroy();
    }

}
