package ch09_exception.a_trycatch;

import java.io.FileInputStream;
import java.io.IOException;

public class CloseResourceTest {
    public static void main(String[] args) {
        CloseResourceTest crt = new CloseResourceTest();
        System.out.println("--있는 파일(정상적)인 경우");
        crt.useStreamOldStyle(".project");
        System.out.println("--없는 파일인 경우");
        crt.useStreamOldStyle("abc.txt");
    }

    public void useStreamOldStyle(String file) {
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file); // 시스템 리소스 사용!!!
            System.out.println("FileInputStream이 생성되었습니다.");
            fileInput.read();
        } catch (IOException e) {
            System.out.println("파일 처리 실패");
        } finally {
            System.out.println("finally 블럭 동작");
            if (fileInput != null) {
                try {
                    fileInput.close();
                    System.out.println("FileInputStream이 종료되었습니다.");
                } catch (IOException e) {
                    System.out.println("FileInputStream 종료 실패");
                }
            }
        }
    }

    public void useStreamNewStye(String file) {
    	// AutoCloseable한 녀석이라면 자동으로 Close 처리
        try (FileInputStream fileInput = new FileInputStream(file)) {
            System.out.println("FileInputStream이 생성되었습니다.");
            fileInput.read();
        } catch (IOException e) {
            System.out.println("파일 처리 실패");
        }
    }
}
