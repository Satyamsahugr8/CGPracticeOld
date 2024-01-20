package com.java.oops;
class P {
    public void m1() {
        System.out.println("p-m1");
    }
}


 

class C extends P{
    public void m1() {
        System.out.println("c-m1");
    }
    
    public void m2() {
        System.out.println("Child m2");
    }
}

 


public class Test {

 

    public static void main(String[] args) {
        
        P p = new P();
        p.m1();
//        p.m2();
        
//        C c1 = new P();   // not possible
//        c1.m1();
        
        C c = new C();
        c.m1();
//        c.m2();
        
        P p1 = new C();   // Parent reference but child class object calls child method
        p1.m1();
//        ((C) p1).m2();
        
    }

 

}