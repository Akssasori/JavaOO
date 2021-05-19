package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employe employe = new Employe();
		
		System.out.println("How many employees will be registered?");
		int many = sc.nextInt();
		for (int i = 1; i <= many ; i++) {
			System.out.println("Emplyoee #"+ i );
			System.out.println("id: ");
			employe.setId(sc.nextInt());
			System.out.println("Name: ");
			employe.setName(sc.next());
			System.out.println("Salary: ");
			employe.setSalary(sc.nextDouble());
			
		}
		
		System.out.println(employe);
		
		
		
	}

}
