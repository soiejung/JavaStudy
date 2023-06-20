package ch03_operator.arithmetic;

import java.math.BigDecimal;

public class FloatProblem {
    public static void main(String[] args) {
        float f1 = 2.0f;
        float f2 = 1.1f;
        // TODO: f1-f2를 출력하시오.
		System.out.println(f1-f2);

        double d1 = 2.0;
        double d2 = 1.1;
        // TODO: d1-d2를 출력하시오.
		System.out.println(d1-d2);
        
        // TODO: d1-d2를 정확히 계산해서 출력하시오.
		int d11 = (int)(d1 * 10);
		int d22 = (int)(d2 * 10);
		
		System.out.println((d11-d22)/10.0);
        // END
    }
}
