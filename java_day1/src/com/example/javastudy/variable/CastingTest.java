package com.example.javastudy.variable;

public class CastingTest {

	public static void main(String[] args) {
		
		int i = 10000;
		double d = i;
		float f = i; // 값 손실 없음: 묵시적 형변환
		System.out.println(d);
		System.out.println(f);
		
		long l = (long)f; // long: 64bit, f: 32bit
		System.out.println(l);
		
		byte b = (byte)l;
		System.out.println(b);

	}

}
