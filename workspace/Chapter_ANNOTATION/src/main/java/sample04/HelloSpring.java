package sample04;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class HelloSpring {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SungJuk sungJuk = null;
		while(true) {	
		 System.out.println("******************");
		 System.out.println("1.입력");
	     System.out.println("2.출력");
	     System.out.println("3.수정");
	     System.out.println("4.삭제");
	     System.out.println("5.종료");
	     System.out.println("******************");
	     System.out.print("번호 : ");
	     int num = scan.nextInt();
	    
	     if(num==5) break;
	  
	  
	     else if(num==1) {  
			sungJuk=(SungJuk) applicationContext.getBean("sungJukInput");		 
	     }else if(num==2) {
	    	 sungJuk=(SungJuk) applicationContext.getBean("sungJukOutput");		 
	     }else if(num==3) {
	    	 sungJuk=(SungJuk) applicationContext.getBean("sungJukUpdate");	
	     }else if(num==4) {
	    	 sungJuk=(SungJuk) applicationContext.getBean("sungJukDelete");	
	     }
	     sungJuk.execute();
		}//while
	     System.out.println("프로그램을 종료합니다");
	     scan.close();
	}

}
