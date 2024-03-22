package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		System.out.println("***Life Cycle***");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		MessageBean messageBean = (MessageBean)applicationContext.getBean("messageBeanImpl2");
		messageBean.helloCall();
	}

}
