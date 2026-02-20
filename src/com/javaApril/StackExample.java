package com.javaApril;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(3);
		s.add(32);
		s.add(33);
		
		for (Integer i : s) {
			System.out.println(i);
			
		}
		
		System.out.println(s.pop());
		s.push(3445);
		
		for (Integer i : s) {
			System.out.println(i);
			
		}
		
		Queue<Integer> d = new LinkedList<Integer>();
		Queue<Integer> d2 = new LinkedList<Integer>();
		
			
		
	}

}
