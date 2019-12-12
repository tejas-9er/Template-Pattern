package com.templatepattern;

public class Junior extends Student {

	@Override
    void Introduce() {
        System.out.println("I am a Junior for Communications.");
    }

    @Override
    void ListCourses() {
    	System.out.println("Following is the list of courses that need to be completed:");
        System.out.println("Comm 301.");
        System.out.println("Comm 302.");
        System.out.println("Comm 303.");
        System.out.println("Comm 304.");
    }

    @Override
    void PayFees() {
        System.out.println("Fees per semester $5698.25.");
    }

}
