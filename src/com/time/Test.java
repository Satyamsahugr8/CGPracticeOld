package com.time;

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
		Set<Data> set1 = new HashSet<>();
		set1.add(new Data(1));
		set1.add(new Data(0));
		Set<Data> set2 = Collections.unmodifiableSet(set1);
		set2.stream().findAny().get().number = 2;
		int number = set1.stream().findAny().get().number;
		int number2 = set1.stream().findAny().get().number;
		System.out.println(number+ " "+ number2);
	}
}




class UnmodifiableSetExample {
    public static void main(String[] args) {
        // Creating a mutable set
        Set<String> mutableSet = new HashSet<>();
        mutableSet.add("Apple");
        mutableSet.add("Banana");
        mutableSet.add("Orange");

        // Creating an unmodifiable view of the set
        Set<String> unmodifiableSet = Collections.unmodifiableSet(mutableSet);

        System.out.println("Mutable Set: " + mutableSet);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);

        try {
            // Attempting to modify the unmodifiable set will result in an exception
            unmodifiableSet.add("Grapes"); // This will throw an UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable set");
        }
    }
}

