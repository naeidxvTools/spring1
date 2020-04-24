package net.imwork.zhanlong.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1、FileSystemXmlApplicationContext是从文件绝对路径加载配置文件
    ApplicationContext ctx = new FileSystemXmlApplicationContext("G:/Test/applicationcontext.xml");
    2、ClassPathXmlApplicationContext是从classpath下加载配置文件(适合于相对路径方式加载)
    ApplicationContext ctx = new ClassPathXmlApplicationContext("/WEB-INF/classes/applicationcontext.xml");
    3、XmlWebApplicationContext是专为web工程定制的
    ServletContext servletContext = request.getSession().getServletContext();
    ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
*/
public class SpringTest
{
    public static void main(String[] args)
    {
        //工厂模式创建对象
        Person person = PersonFactory.getPerson("chinese1");

        System.out.println(person.sayHello("展龙"));
        System.out.println(person.sayGoodbye("展龙"));

        Person person1 = PersonFactory.getPerson("american");
        System.out.println(person1.sayHello("zhanlong"));
        System.out.println(person1.sayGoodbye("zhanlong"));

        System.out.println("====================================");

        //spring方式创建对象
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring1-config.xml")); //已经过时
        BeanFactory factory = new ClassPathXmlApplicationContext("spring1-config.xml");

//        Person chinese = (Person)factory.getBean("chinese");
        Person chinese = factory.getBean("chinese1",Person.class);
        System.out.println(chinese.sayHello("金立从"));
        System.out.println(chinese.sayGoodbye("金立从"));

        Person american = factory.getBean("american",Person.class);
        System.out.println(american.sayHello("zhanziqian"));
        System.out.println(american.sayGoodbye("zhanziqian"));
    }
}
