package ch08.c_enume;

public class Phone {
	
	String number;
	public Phone(String number) {
		this.number = number;
	}

	public String toString() {
		return this.number;
	}
	
	public boolean equals(Object other) {
		
		if(other instanceof Phone) {
			Phone ophone = (Phone)other;
			if(ophone.number.equals(this.number)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p1 = new Phone("010");
		Phone p2 = new Phone("010");
		
		System.out.println(p1+" : "+p2);
		System.out.println(p1==p2); // 같은 객체를 참고하고 있습니까?
		System.out.println(p1.equals(p2)); // 두 객체의 내용이 같습니까?
	}

}
