package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample01.MessageBean;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CalcAdd calcAdd = applicationContext.getBean("calcAdd", CalcAdd.class);
		calcAdd.calculate();
		
		CalcMul calcMul = applicationContext.getBean("calcMul", CalcMul.class);
		calcMul.calculate();
	}

}
