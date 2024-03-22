package sample04;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukUpdate implements SungJuk {
	@Setter
	private List<SungJukDTO2> list; 
	
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수정할 이름을 입력하세요 : ");
		String name = scan.next();
		
		int sw=0;
		for(SungJukDTO2 sungJukDTO2 : list) {
			if(sungJukDTO2.getName().equals(name)) {
				sw=1;
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO2);
				
				System.out.println();

			    System.out.print("국어 점수를 입력하세요 : ");
			    int kor = scan.nextInt();
			    System.out.print("영어 점수를 입력하세요 : ");
			    int eng = scan.nextInt();
			    System.out.print("수학 점수를 입력하세요 : ");
			    int math = scan.nextInt();
			    
			    int tot = kor + eng + math;
			    double avg = tot/3.0;
			    
			    sungJukDTO2.setKor(kor);
			    sungJukDTO2.setEng(eng);
			    sungJukDTO2.setMath(math);
			    sungJukDTO2.setTot(tot);
			    sungJukDTO2.setAvg(avg);
			    
			    System.out.println("\n" + name + "님의 데이터를 입력하였습니다");
			    
			    break; //같은 이름이 없기 때문에
			}//if
		}//for
		
		if(sw==0)
			System.out.println("찾고자 하는 이름이 없습니다.");
			
		
	}
	

}
