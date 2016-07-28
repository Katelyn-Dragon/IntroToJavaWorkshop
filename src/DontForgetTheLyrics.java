
import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	public static void main(String[] args) {
		
	
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	JOptionPane.showMessageDialog(null, "For this game, we'll play the start of a song, and you have to guess the rest of the lyrics.");
		// 4. Make a pop-up to explain the game.

		// 5. Use the playSound method to play your song.
playSound("Ruth B - Lost Boy (Official Video).wav");
		// 6. Make a pop-up for the player to type their answer.
		// 7. If they answered correctly, tell them that they were right.
String answer = JOptionPane.showInputDialog("Type your answer");
if(answer.equals ("with Peter Pan.")){
JOptionPane.showMessageDialog(null, "You're correct!");
		// 8. Otherwise, tell them they are wrong, and give them the answer.
}else{
	JOptionPane.showMessageDialog(null, "You're incorrect, the correct answer is 'with Peter Pan.'");
}
	
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	playSound("Vance Joy - Riptide.wav");
	// 6. Make a pop-up for the player to type their answer.
	// 7. If they answered correctly, tell them that they were right.
String nextanswer = JOptionPane.showInputDialog("Type your answer");
if(nextanswer.equals ("I wanna be your left-hand man.")){
JOptionPane.showMessageDialog(null, "You're correct!");
	// 8. Otherwise, tell them they are wrong, and give them the answer.
}else{
JOptionPane.showMessageDialog(null, "You're incorrect, the correct answer is 'I wanna be your left-hand man.'");
}
}
	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


