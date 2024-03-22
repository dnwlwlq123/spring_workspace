package sample02;

import lombok.Setter;

public class CalcMul implements Calc {
	@Setter
	private int x;
	@Setter
	private int y;
	
	public void calculate() {
		System.out.println(x + "*" +y + "=" + (x*y));

	}

}
