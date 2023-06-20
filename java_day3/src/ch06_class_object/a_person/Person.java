package ch06_class_object.a_person;

public class Person {
	
	// 속성 - 데이터, 필드, 멤버 변수
	 String name;
	 int age;
	 boolean isHungry;
	 
	 // 생성자 overloading
	 public Person() {
		 //this.name = "익명";
		 //this.age = 0;
		 //this.isHungry = false;
		 //this(): 나의 overloading된 다른 생성자 호출
		 //int i =1;; 생성자 호출은 맨 처음 라인에만 가능
		 this("익명", 0, false);
		 
	 }
	// 생성자 - 멤버 변수의 초기화가 목적
	 public Person(String name, int age, boolean isHungry) {
		 // this: 객체 자신 - 로컬 변수와 멤버 변수의 이름 충돌 시 멤버를 가르킨다.
		 this.name = name;
		 this.age = age;
		 this.isHungry = isHungry;
	 }
	 // 기능 - 동작, 메서드, 멤버 메서드
	 void eat() {
		 System.out.println("냠냠..");
		 isHungry = false;
	 }
	 
	 void work() {
		 System.out.println("열심!!!");
		 isHungry = true;
		 
	 }
	 
	 void printInfo() {
		 System.out.println(name+" : "+ age +  " : "+ isHungry);
	 }
	 
}
