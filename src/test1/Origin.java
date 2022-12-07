package test1;

import java.util.Iterator;
import java.util.Scanner;

public class Origin {

	public void otp() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		String name = " ";
		
		name = sc.nextLine();
		
		System.out.println("Your password is : ");
		
		for (int i = 0;i<name.length();i++ ) {
				
				 if(name.charAt(i)>=0) {
				
					 String sst = ("*");
					
					 
					 System.out.print(sst);
						
				 }
				
				
			}
		
			
		
		
		
	}
}