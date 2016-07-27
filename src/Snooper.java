import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("where are you right now?");
		JOptionPane.showMessageDialog(null, "Alright so you're in "+ answer);
		String nextanswer=JOptionPane.showInputDialog("What are you doing, would you mind if you share any contact information?");
	    JOptionPane.showInputDialog(null, "well I'm gonna ask wether you like it or not");
	    JOptionPane.showInputDialog("so first question. What is your adress? If you answer I won't kill your family");
	    
		
		
		
		

	}

}

