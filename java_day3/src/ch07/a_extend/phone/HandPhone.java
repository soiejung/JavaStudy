package ch07.a_extend.phone;

public class HandPhone extends Phone{
	
	String lastCall;
	
	Battery battery = new Battery(100);
	
	public HandPhone(String number) {
		super(number);
	}
	public void call(int number) {
		if (number==1) {
			System.out.println("아빠한테 전화하는 중");
		}else if(number==2) {
			System.out.println("엄마한테 전화하는 중");
		}
	}
	
	public void call() {
		// 마지막 통화했던 번호로 전화
		this.call(this.lastCall);
	}
	
	public void call(String number) {
		// 조상이 가진 기능을 발전시키기 위해 만듦
		// method override
		// lastCall에다가 전화번호 저장
		super.call(number);
		this.lastCall = number;
	}
	
	public void charge() {
		// 배터리 충전 메소드
		battery.charge();
		
	}
	

}
