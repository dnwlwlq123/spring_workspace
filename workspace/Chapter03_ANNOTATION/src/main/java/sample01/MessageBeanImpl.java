package sample01;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class MessageBeanImpl implements MessageBean {
	
	
	private String str;

	@Autowired
	public void setStr(@Value("Have a nice day!!")String str) {
		this.str = str;
	}

	
	public void showPrintBefore() {
		System.out.println("showPrintBefore 메세지 = " + str);
	}

	public void viewPrintBefore() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintBefore 메세지 = " + str);
	}


	public void showPrintAfter() {
		System.out.println("showPrintAfter 메세지 = " + str);
		
	}

	public void viewPrintAfter() {
		
		System.out.println("viewPrintAfter 메세지 = " + str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String showPrint() {
		
		System.out.println("showPrint 메세지 = " + str);
		return "스프링";
	}

	public void viewPrint() {
		
		System.out.println("viewPrint 메세지 = " + str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public void display() {
		System.out.println("display 메세지 = " + str);
	}

}
