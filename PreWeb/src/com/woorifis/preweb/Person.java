package com.woorifis.preweb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.NonFinal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Person {
	
	@NonNull
	private String name;
	private int age;
	private double height;
	public void grow(int cm) {
		height += cm;
		System.out.println("많이 컸군!! 현재 " + height);
	}
	

}
