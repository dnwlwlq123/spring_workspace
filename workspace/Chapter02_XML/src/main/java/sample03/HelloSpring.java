package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		SungJuk sungJuk;
		sungJuk =(SungJuk)applicationContext.getBean("sungJukImpl");
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		System.out.println();
		
		sungJuk.modify();
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		System.out.println();

	}

}
