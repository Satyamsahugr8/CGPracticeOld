package com.pooja;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Data {
	int number;
	Data(int number) {
		this.number = number;
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		Set<Data> set1 = new HashSet<Data>();
		set1.add(new Data(1));
		Set<Data> set2 = Collections.unmodifiableSet(set1);
		set2.stream().findAny().get().number = 2;
		int number = set1.stream().findAny().get().number;
		System.out.println(number);
		
	}

}
