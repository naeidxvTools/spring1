package net.imwork.zhanlong.spring2;

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
        //spring方式创建对象
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring2-config.xml"));
        BeanFactory factory = new ClassPathXmlApplicationContext("spring2-config.xml");

        Person person = factory.getBean("chinese2", Person.class);
        person.work();

        System.out.println("===========================");

        Person person2 = factory.getBean("chinese22",Person.class);
        person2.work();


    }
}
