package com.templatepattern;

public class Sophomore extends Student{
	
	@Override
    void Introduce() {
        System.out.println("I am a Sophomore for Information Security and Assurance.");
    }

    @Override
    void ListCourses() {
    	System.out.println("Following is the list of courses that need to be completed:");
        System.out.println("ISA 201.");
        System.out.println("ISA 202.");
        System.out.println("ISA 203.");
        System.out.println("ISA 204.");
    }

    @Override
    void PayFees() {
        System.out.println("Fees per semester $7056.91.");
    }
    
}
