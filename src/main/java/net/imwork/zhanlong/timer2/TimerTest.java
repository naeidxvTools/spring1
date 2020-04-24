package net.imwork.zhanlong.timer2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimerTest
{
	public static void main(String[] args) throws InterruptedException
	{
		new ClassPathXmlApplicationContext("spring6-config.xml");
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring6-config.xml"));
		
//		Thread.sleep(50000);
	}
}
