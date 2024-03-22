package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc;
		
		calc =  (Calc) applicationContext.getBean("calcAdd");
		calc.calculate(25, 36);
		calc = applicationContext.getBean("calcMul", Calc.class); //캐스팅 안함
		calc.calculate(25, 36);
		System.out.println();
	}

}
