package com.javaApril;

class SingleObject {

	private static SingleObject instance = new SingleObject();

	public static SingleObject getInstance() {
		return instance;
	}

	private SingleObject() {
		super();
	}
	
	
	
	int count = 0;

	public void showMessage() {
//		System.out.println("Hello Message");
		count++;
		System.out.println("count:" + count);
	}
	
}

public class SingletonDemo {

	public static void main(String[] args) {

		SingleObject obj = SingleObject.getInstance();
		obj.showMessage();
		SingleObject obj2 = SingleObject.getInstance();
		obj2.showMessage();
		
//		SingleObject obj3 = new SingleObject();
//		obj3.showMessage();
		
		SingleObject obj4 = SingleObject.getInstance();
		obj4.showMessage();
		
		SingleObject obj5 = SingleObject.getInstance();
		obj5.showMessage();
		
		SingleObject obj6 = SingleObject.getInstance();
		obj6.showMessage();
		
		SingleObject obj7 = SingleObject.getInstance();
		obj7.showMessage();

	}

}
