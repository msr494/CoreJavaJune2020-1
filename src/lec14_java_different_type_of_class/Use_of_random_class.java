package lec14_java_different_type_of_class;

import java.util.Random;

public class Use_of_random_class {

// https://www.javatpoint.com/post/java-random	
	
	public static void main(String[] args) {
		System.out.println("\n--------------- Use of nextInt without limit ------------------"); 
		Random random = new Random(); //choosing randomly, not inputting, so no System.in
        int a = random.nextInt(); //without limit(show negative number too)
        int f = random.nextInt();
        System.out.println("Randomly chosen number1: " + a);
        System.out.println("Randomly chosen number2: " + random.nextInt());
        System.out.println("Randomly chosen number3: " + f);
        
        
        System.out.println("\n--------------- Use of nextInt with limit ------------------");
        int b = random.nextInt(100); //TODO what happen if we put -100
        int e = random.nextInt(1000);
        System.out.println("Randomly chosen number1: " + b);
        System.out.println("Randomly chosen number2: " + e);
        System.out.println("Randomly chosen number3: " + random.nextInt(200));
        
        
        System.out.println("\n--------------- Use of nextBoolean without ------------------");
        boolean c = random.nextBoolean();  
        boolean d = random.nextBoolean(); 
        System.out.println("Random booleanvalue 01 : " + c);    
        System.out.println("Random Boolean value 02 : " + d); 
        System.out.println("Random Boolean value 03 : " + random.nextBoolean());

	}

}
