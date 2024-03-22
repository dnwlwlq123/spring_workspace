package sample01;

import lombok.Setter;


public class MessageBeanImpl implements MessageBean {
	
	
	private String str;

	public void setStr(String str) {
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
