package ch08.b_interface.cowork.bteam;

import ch08.b_interface.cowork.common.Calculator;

// TODO: a 팀의 작업 결과와 무관하게 Calculator를 제대로 구현하세요.

public class CalculatorImpl implements Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	public static void main(String[] args) {
		CalculatorImpl c = new CalculatorImpl();
		int result = c.add(100,200);
		System.out.println(result);
	}
		
}
// END
