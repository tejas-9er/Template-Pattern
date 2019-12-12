package com.templatepattern;

public class Senior extends Student {

	@Override
    void Introduce() {
        System.out.println("I am a Senior for Physics.");
    }

    @Override
    void ListCourses() {
    	System.out.println("Following is the list of courses that need to be completed:");
        System.out.println("Phy 401.");
        System.out.println("ISA 402.");
        System.out.println("ISA 403.");
        System.out.println("ISA 404.");
    }

    @Override
    void PayFees() {
        System.out.println("Fees per semester $8094.91.");
    }

}
