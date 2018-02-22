//base code for a simple card game
import java.util.Random;

import javax.swing.JOptionPane;

public class DeckOfCards {

	public static void main(String[] args) {
		
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		Random randomNum = new Random();
		int max, min, c1, c2, c3, c4, c5, c6, p1, p2;
		max = 12;
		min = 0;
		String playing = "yes";
		
		JOptionPane.showMessageDialog(null, "Welcome to my wonderful 3 card Java Blackjack!\nLet's get right to it by dealing your hands.");
		
		while (playing.equalsIgnoreCase("yes")){
		
		c1 = min + randomNum.nextInt(max);
		c2 = min + randomNum.nextInt(max);
		c3 = min + randomNum.nextInt(max);
		c4 = min + randomNum.nextInt(max);
		c5 = min + randomNum.nextInt(max);
		c6 = min + randomNum.nextInt(max);

		p1 = value[c1]+value[c2]+value[c3];
		p2 = value[c4]+value[c5]+value[c6];
		
		JOptionPane.showMessageDialog(null,"Player 1 gets a "+ranks[c1]+", "+ranks[c2]+", and "+ranks[c3]);
		JOptionPane.showMessageDialog(null,"Player 2 gets a "+ranks[c4]+", "+ranks[c5]+", and "+ranks[c6]);
		
		
		if (p1 > 21 && p2 < 22){
			JOptionPane.showMessageDialog(null,"Player 2 wins thanks to Player 1's bust!");
			playing = JOptionPane.showInputDialog("Would you like to play again? (Yes or No)");
		}
		else if (p2 > 21 && p1 < 22){
			JOptionPane.showMessageDialog(null,"Player 1 wins thanks to Player 2's bust!");
			playing = JOptionPane.showInputDialog("Would you like to play again? (Yes or No)");
		}
		else if (p2 > 21 && p1 > 21){
			JOptionPane.showMessageDialog(null,"Double bust! You both had a hand with a value over 21.\nI guess everyone loses.");
			playing = JOptionPane.showInputDialog("Would you like to play again? (Yes or No)");
		}
		else if (p1 == p2 && p1<22){
			JOptionPane.showMessageDialog(null,"Looks like a push. You both got a hand with the same value as the other.");
			playing = JOptionPane.showInputDialog("Would you like to play again? (Yes or No)");
		}
		else if (p1 > p2 && p1 < 22){
			JOptionPane.showMessageDialog(null,"Player 1 wins with the higher value hand!");
			playing = JOptionPane.showInputDialog("Would you like to play again? (Yes or No)");
		}
		else if (p2 > p1 && p2 < 22){
			JOptionPane.showMessageDialog(null,"Player 2 wins with the higher value hand!");
			playing = JOptionPane.showInputDialog("Would you like to play again? (Yes or No)");
		}
		}
		JOptionPane.showMessageDialog(null, "Thank you for playing!");
		 
	}
}
