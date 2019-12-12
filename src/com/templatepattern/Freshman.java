package com.templatepattern;

public class Freshman extends Student{
	
	@Override
    void Introduce() {
        System.out.println("I am a Freshman for Computer Science.");
    }

    @Override
    void ListCourses() {
    	System.out.println("Following is the list of courses that need to be completed:");
        System.out.println("CS 101.");
        System.out.println("CS 102.");
        System.out.println("CS 103.");
        System.out.println("CS 104.");
    }

    @Override
    void PayFees() {
        System.out.println("Fees per semester $4099.21.");
    }
    
}
