package sample04;

import java.util.List;
import java.util.Scanner;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class SungJukInput implements SungJuk {

		@NonNull
		private SungJukDTO2 sungJukDTO2;
	
		@NonNull
		private List<SungJukDTO2> sungJukInputList;
		
		Scanner scan = new Scanner(System.in);
		public void execute() {
			 System.out.print("이름을 입력하세요 : ");
		     String name = scan.next();
		     System.out.print("국어 점수를 입력하세요 : ");
		     int kor = scan.nextInt();
		     System.out.print("영어 점수를 입력하세요 : ");
		     int eng = scan.nextInt();
		     System.out.print("수학 점수를 입력하세요 : ");
		     int math = scan.nextInt();
		     
		     sungJukDTO2.setName(name);
		     sungJukDTO2.setKor(kor);
		     sungJukDTO2.setEng(eng);
		     sungJukDTO2.setMath(math);
		     sungJukDTO2.setTot(sungJukDTO2.getKor()+sungJukDTO2.getEng()+sungJukDTO2.getMath());
			 sungJukDTO2.setAvg(sungJukDTO2.getTot()/3.0);
			 
			 sungJukInputList.add(sungJukDTO2);
		     
		     System.out.println(sungJukDTO2.getName()+"님의 데이터를 입력하였습니다");
		     

		}
		    
		

	

}
