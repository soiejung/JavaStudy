package ch04_control.condition;

import java.util.Scanner;

public class SwitchNoBreak {

    public static void main(String[] args) {
    	System.out.println("당신의 레벨은?");
    	Scanner scanner = new Scanner(System.in);
    	String level = scanner.next();
        String levelString = "";
        switch (level) {
        case "관리자":
            levelString += "운영자관리";
        case "운영자":
            levelString += "회원관리";
        case "회원":
            levelString += "글쓰기";
        default:
            levelString += "보기";
        }
        System.out.println("당신의 권한은 : " + levelString);
    }
}
