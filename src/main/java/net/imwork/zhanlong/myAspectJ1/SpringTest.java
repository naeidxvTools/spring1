package net.imwork.zhanlong.myAspectJ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
    public static void main(String[] args)
    {
        /*
            1、FileSystemXmlApplicationContext是从文件绝对路径加载配置文件
            ApplicationContext ctx = new FileSystemXmlApplicationContext("G:/Test/applicationcontext.xml");
            2、ClassPathXmlApplicationContext是从classpath下加载配置文件(适合于相对路径方式加载)
            ApplicationContext ctx = new ClassPathXmlApplicationContext("/WEB-INF/classes/applicationcontext.xml");
            3、XmlWebApplicationContext是专为web工程定制的
            ServletContext servletContext = request.getSession().getServletContext();
            ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        */

//        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/myAspectJ1-config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("myAspectJ1-config.xml");

        Person person =  context.getBean("person1",Person.class);
        person.execute();

    }
}
