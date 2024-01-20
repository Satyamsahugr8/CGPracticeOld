package com.java.Basics;

public class A9_ReverseString {
    
    public static void main(String[] args) {
        
        // TASK
        // SATYAM = MAYTAS
        // 012345 = 543210
        
        String str = "SATYAM";
        int strlength = str.length();
        
//        System.out.println(strlength);
        
        char [] ch = new char[strlength];
        
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(ch.length-(i+1));
        }
        
//        for printing char array items
        
//        for (char c : ch) {
//            System.out.print(c);
//        }
        
        
//        // 1 way
        
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < ch.length; i++) {
//                sb.append(ch[i]);
//            }
//        String str2 = sb.toString();
//        System.out.println(str2);
        
        
        //2 way
        
        String string = new String(ch);
        System.out.println(string);
     
    }

 

}