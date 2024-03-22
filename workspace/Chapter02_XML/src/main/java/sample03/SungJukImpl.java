package sample03;

import java.util.Scanner;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SungJukImpl implements SungJuk {
	@NonNull
	private SungJukDTO sungJukDTO;
	
	
	public void calcTot() {
		
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());

	}
	
	public void calcAvg() {
		
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
	}
	
	public void display() {
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println("이름 = " + sungJukDTO.getName());
		System.out.println("국어 = " + sungJukDTO.getKor());
		System.out.println("영어 = " + sungJukDTO.getEng());
		System.out.println("수학 = " + sungJukDTO.getMath());
		System.out.println("총점 = " + sungJukDTO.getTot());
		System.out.println("평균 = " + String.format("%.2f", sungJukDTO.getAvg()));
		System.out.println("-----------------");
	}
	
	public void modify() {
		Scanner scan = new Scanner(System.in);
		 System.out.print("이름을 입력하세요 : ");
	     String name = scan.next();
	     System.out.print("국어 점수를 입력하세요 : ");
	     int kor = scan.nextInt();
	     System.out.print("영어 점수를 입력하세요 : ");
	     int eng = scan.nextInt();
	     System.out.print("수학 점수를 입력하세요 : ");
	     int math = scan.nextInt();
	     
	     sungJukDTO.setName(name);
	     sungJukDTO.setKor(kor);
	     sungJukDTO.setEng(eng);
	     sungJukDTO.setMath(math);

	}

}
