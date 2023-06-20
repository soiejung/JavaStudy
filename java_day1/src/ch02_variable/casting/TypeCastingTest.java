package ch02_variable.casting;

public class TypeCastingTest {
    public static void main(String[] args) {
        // TODO: 다음 변수들의 출력 결과를 예측하고(값이 깨졌다 등) 직접 출력해보세요.
        int i1 = 1234;
        long l1 = i1;
        byte b1 = (byte) i1;
		

        double d1 = i1;
        byte b2 = (byte) d1;
		

        double d2 = 0.12345678901234567890;
        float f1 = (float) d2;
		

        byte b3 = 67;
        char c1 = (char) b3;
        float f2 = c1;
		

        boolean b = false;
        // int i2 = (int)b;
        // Cannot cast from boolean to int
    }

}
