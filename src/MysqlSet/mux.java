package MysqlSet;

import java.util.Scanner;

public class mux {
	
	public static String choice(){
		
		System.out.println("A. Add a new car");
		System.out.println("B. Add a new member");
		System.out.println("C. Find detail of a car");
		System.out.println("D. Find all available car");
		System.out.println("Please enter your choice (Uppercase!)");
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		return s;
	}
	
}
