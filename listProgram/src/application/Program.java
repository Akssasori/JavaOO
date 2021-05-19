package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("How many employees will be registered?");
		int many = sc.nextInt();
		for (int i = 1; i <= many ; i++) {
			System.out.println("Emplyoee #"+ i );
			System.out.println("id: ");
			
			
			
		}
		
		
		
	}

}
