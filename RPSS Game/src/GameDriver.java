
public class GameDriver {

	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static final int SAW = 4;
	
	public static void display(String who, int s) {
		switch (s) {
		case GameDriver.ROCK:
			System.out.print(who + " selected Rock ");
			break;
		case GameDriver.PAPER:
			System.out.print(who + " selected Paper ");
			break;
		case GameDriver.SCISSORS:
			System.out.print(who + " selected Scissors ");
			break;
		case GameDriver.SAW:
			System.out.print(who + " selected Saw ");
			break;
		default:
			break;
		}
	}
	
	public static int compareSelections(int playerSelection, int computerSelection) {
		if(playerSelection == computerSelection) return 0;
		switch (playerSelection) {
		case ROCK:
			return(computerSelection == SAW ? 1 : -1);
			
		case PAPER:
			return(computerSelection == ROCK ? 1 : -1);
					
		case SCISSORS:
			return(computerSelection == PAPER ? 1 : -1);
			
		case SAW:
			return(computerSelection == SCISSORS ? 1 : -1);
			
			
		
	}
	
	return 0;
}
}
