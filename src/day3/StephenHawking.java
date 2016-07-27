package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
	
	// 2. ask the user for a sentence
	String words = JOptionPane.showInputDialog("Can You Please Put In A Sentance");
	// 3. call the speak method below and send it the sentence
	speak(words);
	// 4. repeat steps 2 and 3 a lot of times
	for (int i = 0; i < 0; i++) {
		String nextwords=JOptionPane.showInputDialog("My name is Stephen Hawking ");
		
	}

	/* Don’t change this…. */
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
