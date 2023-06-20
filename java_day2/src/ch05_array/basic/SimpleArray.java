package ch05_array.basic;

public class SimpleArray {
    public static void main(String[] args) {
    	int point = 3;
        int [] points = new int[3];
        System.out.println(point);// 기본형 변수 - data를 가진다.
        System.out.println(points);// 참조형 변수 - 주소를 가진다.
        System.out.printf("배열의 크기: %d%n", points.length);
        
        points[0] = 1;
        points[1] = 'A';
        //points[2] = 1.5;

        System.out.printf("0 번째 요소: %d%n", points[0]);
        System.out.printf("1 번째 요소: %d%n", points[1]);
        System.out.printf("2 번째 요소: %d%n", points[2]);
    }
}
