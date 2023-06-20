package ch07.c_modifier;

class FinalMemberClass {
    final String name;

    public FinalMemberClass(String name) {
        this.name = name;
    }
    public void printName() {
    	System.out.println(this.name);
    }
}


class MyClass extends FinalMemberClass{
	// reference type member - null
	final String name;
	
	public MyClass(String name) {
		//super(name);
		//blank file은 생성자에서 딱 한번 초기화 가능
		this.name = name;
	}
	
	public void printName() {
		System.out.println("자식이 재정의!!" + name);
	}
}

public class BlankFinalTest {
    public static void main(String[] args) {
        FinalMemberClass fmc1 = new FinalMemberClass("hong");
        FinalMemberClass fmc2 = new FinalMemberClass("lim");

        System.out.printf("name: fmc1 - %s, fmc2 - %s%n", fmc1.name, fmc2.name);
        //The final field FinalMemberClass.name cannot be assigned
        //fmc1.name = "kim";
    }
}
