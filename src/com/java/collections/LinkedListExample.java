package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList al = new LinkedList();
		al.add("Dakshayani");
		al.add(5);
		al.add(3.4);
		al.add(null);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
