package lec07_java_oop_inheritance_01;

public class MyGrandfather {
	
	// 1 -- > variable
	public String Name;  //variable declared
	public int age;
	public char hairColor;
	
	// 2  -- > Constructor
	//Constructor name is same as Class name
	public MyGrandfather() {  //constructor declared
		System.out.println("This constructor is from default constructor of grandfather");
	}
	
	// 3 -- > method
	// Method can't be declared in a class, rather implemented
	public void grandfatherInfo() { //method implemented
		System.out.println("Grandfather: Ismail");
	}

}
