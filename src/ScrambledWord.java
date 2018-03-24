public class ScrambledWord {

	public static void main(String[] args) {
		gameControl controller = new gameControl();
		
		controller.begin();
		
		while(true){
			controller.guessWord();
		}
	}

}
