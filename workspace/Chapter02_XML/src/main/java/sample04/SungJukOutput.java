package sample04;

import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class SungJukOutput implements SungJuk {

	@NonNull
	private List<SungJukDTO2> sungJukOuputList;
	
	public void execute() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO2 sungJukDTO2: sungJukOuputList) {
			
		
		System.out.println(sungJukDTO2.getName()+"\t"+sungJukDTO2.getKor()+"\t"+sungJukDTO2.getEng()+"\t"+sungJukDTO2.getMath()+"\t"+
				sungJukDTO2.getTot()+"\t"+
				String.format("%.2f", sungJukDTO2.getAvg())+"\t");
		}//for
		
		
	}

}
