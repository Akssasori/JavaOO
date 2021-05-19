package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		//list.remove("Anna");
		//list.remove(2);
		
		// para cada string x pertecente a minha list imprima x
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		// remover todos com iniciais 'M'
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		//Quando o indexOf n�o encontra o elemento ele mostra -1
		System.out.println("Index of bob: " + list.indexOf("Lucas"));
		
		System.out.println("------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) =='A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}

}
