package ch07.a_extend.phone;

public class PhoneTest {

	public static void main(String[] args) {
		
		HandPhone handphone = new HandPhone("010-9876-5432");
		handphone.call("010-1111-2222");
		handphone.call();
		handphone.call(1);
		handphone.charge();

	}

}
