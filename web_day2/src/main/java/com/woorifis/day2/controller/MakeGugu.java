package com.woorifis.day2.controller;

import java.util.ArrayList;
import java.util.List;

public class MakeGugu {

	private static MakeGugu gugu = new MakeGugu();
	
	private MakeGugu() {}
	
	public static MakeGugu getInstance() {
		return gugu;
	}
	public List<Integer> getGugu(int dan) {

		List<Integer> gugu = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			gugu.add(dan * (i + 1));
		}
		return gugu;
	}

}
