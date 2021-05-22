package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employe> listEmploye = new ArrayList<>();
		
		Employe employe = new Employe();
		
		System.out.println("How many employees will be registered?");
		int many = sc.nextInt();
		for (int i = 1; i <= many ; i++) {
			System.out.println("Emplyoee #"+ i );
			System.out.println("id: ");
			listEmploye.add(employe.setId(sc.nextInt()));
			//employe.setId(list.add(sc.nextInt()));
			System.out.println("Name: ");
			employe.setName(sc.next());
			System.out.println("Salary: ");
			employe.setSalary(sc.nextDouble());
			
		}
		
		System.out.println(listEmploye);
		
		
		
	}

}
