import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class gameControl {
	
	//These are the correct words
	ArrayList<String> wordsList = new ArrayList<>(
		    Arrays.asList("weak", "strong", "high", "heavy", "long", "tall", "short", "row", "old", "new", "recent", "orange", "red", "dark", "sky",
		    				"circle", "white", "slow", "side", "win", "poor", "rich", "work", "mind", "calm", "think", "move", "sound", "light", "town"));
	
	//This array is used to store the scrambled words
	char[] word1, word2, word3, word4, word5, word6, word7, word8, word9, word10,
			word11, word12, word13, word14, word15, word16, word17, word18, word19, word20,
			  word21, word22, word23, word24, word25, word26, word27, word28, word29, word30;
	
	String userInput;
	
	int numOfAttempts = 1;
	int points = 0;
	int counter = 3;
	int level = 1;
	
	Random rand = new Random();
	
	public void guessWord(){
		convertToChar();
		callAnotherMethod();
		convertBackToString();		
	}
	
	//This will convert each word into characters
	public void convertToChar(){
		word1 = wordsList.get(0).toCharArray();
		word2 = wordsList.get(1).toCharArray();
		word3 = wordsList.get(2).toCharArray();
		word4 = wordsList.get(3).toCharArray();
		word5 = wordsList.get(4).toCharArray();
		word6 = wordsList.get(5).toCharArray();
		word7 = wordsList.get(6).toCharArray();
		word8 = wordsList.get(7).toCharArray();
		word9 = wordsList.get(8).toCharArray();
		word10 = wordsList.get(9).toCharArray();
		word11 = wordsList.get(10).toCharArray();
		word12 = wordsList.get(11).toCharArray();
		word13 = wordsList.get(12).toCharArray();
		word14 = wordsList.get(13).toCharArray();
		word15 = wordsList.get(14).toCharArray();
		word16 = wordsList.get(15).toCharArray();
		word17 = wordsList.get(16).toCharArray();
		word18 = wordsList.get(17).toCharArray();
		word19 = wordsList.get(18).toCharArray();
		word20 = wordsList.get(19).toCharArray();
		word21 = wordsList.get(20).toCharArray();
		word22 = wordsList.get(21).toCharArray();
		word23 = wordsList.get(22).toCharArray();
		word24 = wordsList.get(23).toCharArray();
		word25 = wordsList.get(24).toCharArray();
		word26 = wordsList.get(25).toCharArray();
		word27 = wordsList.get(26).toCharArray();
		word28 = wordsList.get(27).toCharArray();
		word29 = wordsList.get(28).toCharArray();
		word30 = wordsList.get(29).toCharArray();
	}
	
	public void callAnotherMethod(){
		rearrangeLetters(word1);
		rearrangeLetters(word2);
		rearrangeLetters(word3);
		rearrangeLetters(word4);
		rearrangeLetters(word5);
		rearrangeLetters(word6);
		rearrangeLetters(word7);
		rearrangeLetters(word8);
		rearrangeLetters(word9);
		rearrangeLetters(word10);
		rearrangeLetters(word11);
		rearrangeLetters(word12);
		rearrangeLetters(word13);
		rearrangeLetters(word14);
		rearrangeLetters(word15);
		rearrangeLetters(word16);
		rearrangeLetters(word17);
		rearrangeLetters(word18);
		rearrangeLetters(word19);
		rearrangeLetters(word20);
		rearrangeLetters(word21);
		rearrangeLetters(word22);
		rearrangeLetters(word23);
		rearrangeLetters(word24);
		rearrangeLetters(word25);
		rearrangeLetters(word26);
		rearrangeLetters(word27);
		rearrangeLetters(word28);
		rearrangeLetters(word29);
		rearrangeLetters(word30);
	}
	
	public void rearrangeLetters(char[] word){
		//a temporary variable for swapping
		char temp;
		
		//This algorithm will rearrange the letters in some order
		for(int i = word.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(word[j] > word[j + 1]){
					temp = word[j];
					word[j] = word[j + 1];
					word[j + 1] = temp;
				}
			}
		}						
	}
	
	public void convertBackToString(){
		String reWord1 = new String(word1);
		String reWord2 = new String(word2);
		String reWord3 = new String(word3);
		String reWord4 = new String(word4);
		String reWord5 = new String(word5);
		String reWord6 = new String(word6);
		String reWord7 = new String(word7);
		String reWord8 = new String(word8);
		String reWord9 = new String(word9);
		String reWord10 = new String(word10);
		String reWord11 = new String(word11);
		String reWord12 = new String(word12);
		String reWord13 = new String(word13);
		String reWord14 = new String(word14);
		String reWord15 = new String(word15);
		String reWord16 = new String(word16);
		String reWord17 = new String(word17);
		String reWord18 = new String(word18);
		String reWord19 = new String(word19);
		String reWord20 = new String(word20);
		String reWord21 = new String(word21);
		String reWord22 = new String(word22);
		String reWord23 = new String(word23);
		String reWord24 = new String(word24);
		String reWord25 = new String(word25);
		String reWord26 = new String(word26);
		String reWord27 = new String(word27);
		String reWord28 = new String(word28);
		String reWord29 = new String(word29);
		String reWord30 = new String(word30);
		
		//This list contains the scrambled words
		ArrayList<String> scrambledWordsList = new ArrayList<>(
			    Arrays.asList(reWord1, reWord2, reWord3, reWord4, reWord5, reWord6, reWord7, reWord8, reWord9, reWord10,
			    				reWord11, reWord12, reWord13, reWord14, reWord15, reWord16, reWord17, reWord18, reWord19, reWord20,
			    					reWord21, reWord22, reWord23, reWord24, reWord25, reWord26, reWord27, reWord28, reWord29, reWord30));
		
		//This will generate a random word from the list above
		String randomWord = scrambledWordsList.get(rand.nextInt(scrambledWordsList.size()));
		wordGame(randomWord);
	}
	
	public void begin(){
		
		JOptionPane.showMessageDialog(null, "Scrambled Word\nordw = word");
	}
	
	public void wordGame(String randomWord){

		JOptionPane.showMessageDialog(null, "Level " + level, "ScrambledWord", JOptionPane.PLAIN_MESSAGE);

		userInput = JOptionPane.showInputDialog("Rearrange the letters to form the correct word:\n" + randomWord);
		counter--;
		
		//This condition checks if the word entered by the user is available in the words list
		if (wordsList.contains(userInput)){								
			points += 5;
			JOptionPane.showMessageDialog(null, "Well done!\nYou have " + points + " points in total");
			level++;
			counter = 3;
			
		} else if (!wordsList.contains(userInput)){				
			JOptionPane.showMessageDialog(null, "Wrong!\nYou have " + counter + " attempts left");
		} 
		
		reset();
	}
	
	public void reset(){
		
		if (counter == 0){
			level = 1;
			points = 0;
			counter = 3;
			
			JOptionPane.showMessageDialog(null, "You have used all your attempts! Click 'OK' to restart the game.", "ScrambledWord", JOptionPane.PLAIN_MESSAGE);
			
		}
	}
}
