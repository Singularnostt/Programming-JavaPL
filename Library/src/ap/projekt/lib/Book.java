package ap.projekt.lib;

import java.util.Scanner;

public class Book {
	private String name;
	private int pageCount;

	public String getName() {
		return name;
	}
	
	public String setName() {
		System.out.println("Napisz imiê ksi¹¿ki");
		Scanner scanner = new Scanner(System.in);
		
		return name;
	}
	
}
