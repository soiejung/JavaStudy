package ch05_array.multi;

public class SimpleInitTest {

    public static void main(String[] args) {
        char[][] charArr2Dim = { 
                                { 'H', 'E', 'L', 'L', 'O' }, 
                                { 'J', 'A', 'V', 'A' }, 
                                { 'W', 'O', 'R', 'L', 'D' } 
                                };
        System.out.println(charArr2Dim.length);
        
        // 전통적인 for: 번거롭지만 index 사용 가능
        for(int i=0; i<charArr2Dim.length; i++) {
            for(int j=0; j<charArr2Dim[i].length; j++) {
                System.out.print(charArr2Dim[i][j]);
            }
            System.out.println();
        }
        
        //advanced for 문장: 간단하지만 index 사용 불가
        for(char [] row : charArr2Dim) {
        	for(char c : row) {
        		System.out.print(c);
        	}
        	System.out.println();
        }
    }
}
