package sample04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Component
public class SungJukOutput implements SungJuk {
	@Autowired
	@Qualifier("list")
	private List<SungJukDTO2> list;
	
	
	public void execute() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO2 sungJukDTO2: list) {
			
		
		System.out.println(sungJukDTO2.getName()+"\t"+sungJukDTO2.getKor()+"\t"+sungJukDTO2.getEng()+"\t"+sungJukDTO2.getMath()+"\t"+
				sungJukDTO2.getTot()+"\t"+
				String.format("%.2f", sungJukDTO2.getAvg())+"\t");
		}//for
		
		
	}

}
