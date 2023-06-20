package ch05_array.basic;

import java.util.Arrays;

public class BoundsTest {

    public static void main(String[] args) {
        char [] charArray = new char [3];
        char temp = 'A';
        // TODO: charArray에 'A', 'B', 'C'를 저장하세요.
        for(int i=0;i<charArray.length;i++) {
        	charArray[i] = temp;
        	temp += 1;
        }
        
        // END
        
        // TODO: index 0~4까지 charArray의 요소를 출력하시오. 문제 상황을 인지하고 대책을 마련하시오.
        // 배열의 길이는 3인데 index 4를 출력하라고 해서 에러가 뜸. charArray.length로 변경
        for(int i=0; i<charArray.length; i++) {
        	System.out.println(charArray[i]);
        }
        
        // 단지 배열의 요소를 출력해보고 싶다면?
        System.out.println(Arrays.toString(charArray));
        // END
    }
}
