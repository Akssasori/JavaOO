package entities;

import java.util.ArrayList;
import java.util.List;

public class Employe {
	
	private int id;
	private String name;
	private Double salary;
	
	List<Employe> employe = new ArrayList<>();
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
//	public void increase(int id){
//		
//	}
	
	
	
	
	
	

}
