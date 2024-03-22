package sample02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class CalcAdd implements Calc {

	private int x;
	private int y;
	public CalcAdd(@Value("25")int x, @Value("36")int y) {
		super();
		this.x = x;
		this.y = y;
	}


	
	public void calculate() {
		System.out.println(x + "+" +y + "=" + (x+y));

	}

}
