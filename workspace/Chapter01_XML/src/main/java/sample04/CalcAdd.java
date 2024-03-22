package sample04;

public class CalcAdd implements Calc {

	public CalcAdd() {
		
	}
	@Override
	public void calculate(int x, int y) {
		
		System.out.println(x +" + "+y+"=" + (x+y) );
	}

}
