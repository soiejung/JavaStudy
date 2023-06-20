package ch07.b_imp;

import java.util.Date;
import java.util.List;
import static java.lang.System.out;
// TODO: 필요한 클래스를 import 해보자.

// END

public class ImportTest {
    // TODO: java.util.Date, java.util.List, java.io.InputStream, java.awt.List를 사용해보자.
	Date date;
	List<String> list;
	java.awt.List mylist;
	
	public static void main(String[] args) {
		
		ImportTest it = new ImportTest();
		it.date = new Date();
		System.out.println(); //out은 static 변수
		//static import 결과
		out.println();
	}
	
    // END
}
