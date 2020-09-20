package org.lizette.project1;

public class Lizette {

	public void print(String input, int count) {
		for (int i=0; i < count; i++) {
			System.out.println(i + " " + input);
		}
	}
	
	public String echo(String input) {
		return "LIZETTE: " + input;
	}
	
}
