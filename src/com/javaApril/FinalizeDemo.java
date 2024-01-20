package com.javaApril;

public class FinalizeDemo {

	// overriding finalize()
	public void finalize() {
		System.out.println("ratan sir object is destroyed");
		System.out.println(10 / 0);
	}

	public static void main(String[] args) {
		FinalizeDemo t1 = new FinalizeDemo();
		FinalizeDemo t2 = new FinalizeDemo();
		;
		;
		;
		;
		;
		;
		;// usage of objects
		t1 = null; // this object is eligible to Gc
		t2 = null; // this object is eligible to Gc
		System.gc(); // calling GarbageCollector
	}
}
