package lec13_1_java_access_modifiers_public;

import lec13_5_java_access_modifiers_outside_package.Address;
import lec13_5_java_access_modifiers_outside_package.Calculator;

public class B extends M {
	public static void main(String args[]) {
		System.out.println("---------- public modifeir can also be accessed outside the class ----------");
		System.out.println("---------- public modifeir can be accessed within the package ----------\n");
		A obj = new A();
		obj.msg1();
		System.out.println(obj.Info);
		
		System.out.println("\n\n---------- public modifeir can be accessed inside the package by subclass (child class) only----------");
		M aM1 = new M();
		aM1.m();
		
		System.out.println("\n\n---------- public modifeir can be accessed inside the package without subclass (child class) only----------");
		W aw2 = new W();
		aw2.w();
		
		
		System.out.println("\n\n---------- public modifeir can be accessed outside the package by subclass (child class) only----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		Address address = new Address(); 
		address.myInfo();
		
		System.out.println("\n\n---------- public modifeir can be accessed outside the package without subclass (child class) ----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		Calculator cal = new Calculator();
		cal.addition();
		cal.subtraction();
	}

}
