package ch07.c_modifier;

// 기능(메서드만 존재), 상태(멤버 변수가 없다!) - stateless한 클래스
class SingletonClass {
    // TODO:SingletonClass에 singleton design pattern을 적용하시오.
	private static SingletonClass sc = new SingletonClass();
	
	/*
	public void setSingletonClass(SingletonClass sc) {
		this.sc = sc;
	}*/
	
	public static SingletonClass getSingletonClass() {
		return sc;
	}
	private SingletonClass() {
		
	}
    // END

    public void sayHello() {
        System.out.println("Hello");
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        // TODO: SingletonClass 객체를 사용해보자.
    	//SingletonClass sc = new SingletonClass();
    	SingletonClass sc = SingletonClass.getSingletonClass();
    	sc.sayHello();
        // END
    }
}
