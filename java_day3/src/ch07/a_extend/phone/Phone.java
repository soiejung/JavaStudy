package ch07.a_extend.phone;

public class Phone {
	String number;
	
	public Phone() {}
	public Phone(String number) {
		
		this.number = number;
		
	}
	
	public void call(String number) {
		System.out.println(number+"와 통화");
	}
}
