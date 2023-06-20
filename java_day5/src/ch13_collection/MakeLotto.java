package ch13_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MakeLotto {
	
	private static void testRandom() {
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			int rnum = rand.nextInt(45)+1;
			System.out.println(rnum);
		}
	}

	private static void makeLottoBySet() {
		Set <Integer> lotto = new HashSet<>();
		Random rand = new Random();
		for(;lotto.size()<6;) {
			int rnum = rand.nextInt(45)+1;
			lotto.add(rnum);
		}
		System.out.println(lotto);
	}
	
	private static void makeLottoByList() {
		List<Integer> lotto = new ArrayList<>();
		Random rand = new Random();
		for(;lotto.size()<6;) {
			int rnum = rand.nextInt(45)+1;
			if(!lotto.contains(rnum)) {
				lotto.add(rnum);
			}
		}
		System.out.println(lotto);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testRandom();
		makeLottoBySet();
		makeLottoByList();
	}

}
