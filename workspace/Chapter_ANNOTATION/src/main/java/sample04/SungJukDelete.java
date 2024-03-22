package sample04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Setter;
@Component
public class SungJukDelete implements SungJuk {
	@Autowired
	@Qualifier("list")
	private List<SungJukDTO2> list; 

	
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 이름을 입력하세요 : ");
		String name = scan.next();
		
		int sw=0;
		
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) { //항목이 있으면 true 항목이 없으면 false
			//it가 가리키는 항목을 꺼내서 저장한 후 it는 다음 항목으로 이동합니다.
			SungJukDTO2 sungJukDTO2 = it.next();
			
			if(sungJukDTO2.getName().equals(name)) {
				sw=1;
				it.remove(); //아까 보관했던 항목을 제거합니다.
				System.out.println("\n" + name + "님을 삭제 하였습니다");
				break;
			}//if
		}//while
		if(sw==0)
			System.out.println("찾고자 하는 이름이 없습니다");

	}

}
