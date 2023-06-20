package ch04_control.condition;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        System.out.println("32 ~ 126 사이의 정수를 입력하세요.");
        Scanner scanner = new Scanner(System.in); // 사용자로부터 입력을 받겠다.
        int scanned = scanner.nextInt();
        String type = null;
        if (scanned >= 48 && scanned < 58) {
            type = "숫자";
        } else if (scanned >= 66 && scanned < 91) {
            type = "대문자";
        } else if (scanned >= 97 && scanned < 123) {
            type = "소문자";
        } else {
            type = "기타 타입";
        }
        System.out.printf("숫자 %d는 문자로 %c이고 %s입니다.", scanned, scanned, type);
        //scanner.close();
        
        // 나이를 입력하세요!!!
        // 8살 미만 - 미취학
        // 18세 미만 - 청소년
        // 50세 미만 - 청년
        // 50세 이상 - 장년
        
        System.out.println("\n나이를 입력하세요!!");
        Scanner scanner1 = new Scanner(System.in);
        int scanned1 = scanner1.nextInt();
        String ageType = null;
        
        if (scanned1 < 8) {
        	ageType = "미취학";
        }else if (scanned1 < 18) {
        	ageType = "청소년";
        }else if (scanned1 < 50) {
        	ageType = "청년";
        }else if (scanned1 >= 50) {
        	ageType="정년";
        }
        System.out.printf("%s",ageType);
        
        scanner.close();
    }

}
