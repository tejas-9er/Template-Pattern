package com.templatepattern;

public class Driver {
	public static void main(String[] args) {
		Student student = new Freshman();
        student.Acedemia();
		
        System.out.println();
        
		student = new Sophomore();
        student.Acedemia();
     
        System.out.println();
        
        student = new Junior();
        student.Acedemia();
        
        System.out.println();
        
        student = new Senior();
        student.Acedemia();
    }
}
