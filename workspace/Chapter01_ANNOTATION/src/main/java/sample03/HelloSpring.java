package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		
		
		MessageBean messageBean1 = (MessageBean) applicationContext.getBean("messageBean");
		messageBean1.sayHello("Spring");
		System.out.println();//스프링은 무조건 싱글톤으로 잡음
		
		MessageBean messageBean2 = (MessageBean) applicationContext.getBean("messageBean");
		messageBean2.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean3 = (MessageBean) applicationContext.getBean("messageBean");
		messageBean3.sayHello("Spring");
		System.out.println();
		
		
		
		
		
		
		
	}

}