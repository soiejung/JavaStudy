package ch04_control.condition;

import java.util.Scanner;

public class SwitchDayByMonth {

	public static void main(String[] args) {
		
		// 달을 입력 받는다 --> 거기에 해당하는 날 수를 출력
		System.out.println("달을 입력해주세요:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = 0;
		switch(month) {
		
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			default:
				day = 30;
				break;
			
		}
		System.out.printf("%d\n", day);
		
	}

}
