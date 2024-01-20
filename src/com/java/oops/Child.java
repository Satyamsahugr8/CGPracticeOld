package com.java.oops;

class Parent {
	
	void property(){
		System.out.println("money+land+house");
		}
	
	void marry(){
		System.out.println("black girl"); 
		}//overridden method
	}


public class Child extends Parent {
	
	void property(){
		System.out.println("Child property");
		}
	
	void marry() {
		System.out.println("Child marry"); //overriding method
		}
	
	void sex() {
		System.out.println("Sax of child");
	}
	
	public static void main(String[] args){ 
	
	Child c = new Child();
	c.property();             //Child property
	c.marry();                //Child marry
	c.sex();                  //Sex of child

	System.out.println("--------------");
	
	Parent p = new Parent();  
	p.property();             //money+land+hhouse   
	p.marry();                //black girl
	
	System.out.println("--------------");
	
	Parent P = new Child(); // p = c => c
	P.property();
	P.marry();
//	p.sex();
	
	// it is not accessible because compiler check parent class if sex method is present 
	// or not if it is not present then compile time error will be generated
	// 
	// Hence when only overridden method is possible for parent type reference of child type object
	
    // Based on above point we can say by using parent reference it is possible to call only overriding 
    // methods (m1 () ) of child class but it is not possible to call direct method(m2() ) of child class.

	
    // Child C = new Parent(); // Not possible
	

	}}
