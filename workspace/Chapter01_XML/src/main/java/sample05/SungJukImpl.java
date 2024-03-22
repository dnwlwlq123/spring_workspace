package sample05;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
		Scanner scan = new Scanner(System.in);
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		
		
	public SungJukImpl() {
		 System.out.print("이름을 입력하세요 : ");
	     name = scan.next();
	     System.out.print("국어 점수를 입력하세요 : ");
	     kor = scan.nextInt();
	     System.out.print("영어 점수를 입력하세요 : ");
	     eng = scan.nextInt();
	     System.out.print("수학 점수를 입력하세요 : ");
	     math = scan.nextInt();
	}
	@Override
	public void calc() {
		 tot = kor + eng + math;
		 avg = tot/3;

	}
	@Override
	public void display() {
		System.out.println();
		System.out.println("-----------------");
		System.out.println("이름 = " + name);
		System.out.println("국어 = " + kor);
		System.out.println("영어 = " + eng);
		System.out.println("수학 = " + math);
		System.out.println("총점 = " + tot);
		System.out.println("평균 = " + String.format("%.2f", avg));
		System.out.println("-----------------");

	}

}
