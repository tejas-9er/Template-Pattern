package com.templatepattern;

public abstract class Student {
	abstract void Introduce();
    abstract void ListCourses();
    abstract void PayFees();
    
    public final void Acedemia() {
        Introduce();
        ListCourses();
        PayFees();
    }
}
