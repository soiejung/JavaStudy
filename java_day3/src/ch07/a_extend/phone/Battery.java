package ch07.a_extend.phone;

public class Battery {

	int capacity;
	int current;
	
	public Battery(int capacity, int current) {
		this.capacity = capacity;
		this.current = current;
	}
	public Battery(int capacity) {
		this(capacity,0);
	}
	public void charge() {
		System.out.println("현재 배터리 용량:"+current+" 전체 배터리 용량: "+capacity);
		System.out.println("배터리 충전");
		this.current = ++current;
		System.out.println("현재 배터리 용량:"+current+" 전체 배터리 용량: "+capacity);
		
	}
}
