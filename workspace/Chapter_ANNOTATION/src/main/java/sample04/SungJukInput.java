package sample04;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	
	//생성된 빈들 중에서 SungJukDTO2 타입을 찾아서 자동을 매핑을 해라

		@Autowired
		private SungJukDTO2 sungJukDTO2;
	
		@Autowired
		@Qualifier("list")
		private List<SungJukDTO2> list;
		
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
			 
			 list.add(sungJukDTO2);
		     
		     System.out.println(sungJukDTO2.getName()+"님의 데이터를 입력하였습니다");
		     

		}
		    
		

	

}
