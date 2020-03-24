

public class Game {
private Player Player1;
private Player Player2;
private Player computer;
private int computerScore;
private int numberOfGames;


public Game() {
	
	Player1 = new Player();
	Player2 = new Player();
	computer = new Player();
	computerScore = 0;
	numberOfGames = 0;
}

public static void main(String[] args) {
	
	Game game = new Game();
	game.getplayerName();
	game.getplayer2Name();
	game.startGame();
		
}
public void getplayer1Name() {
	
}

public void getplayer2Name() {
	// TODO Auto-generated method stub
	
}

public void startGame() {
	int player1input = Player1.getInput();
	GameDriver.display(Player1.getName(), player1input);
	
	int player2input = Player2.getInput();
	GameDriver.display(Player2.getName(), player2input);
	
	int computerinput = computer.getInput();
	GameDriver.display("computer", computerinput);
	
	int compareResult=GameDriver.compareSelections(player1input, computerinput);
	int compareResult1=GameDriver.compareSelections(player2input, computerinput);
	int compareResult2=GameDriver.compareSelections(player1input, player2input);
	int player1Score = 0;
	int player2Score = 0;
	switch (compareResult) {
	case 0: // Tie
		System.out.println("Tie!");
		break;
	case 1: // player 1 wins
		System.out.println(Player1.getName()+ " Beats " + Player2.getName() + "computer" +" You won!");
		player1Score++;
		break;
	case 2: // player 2 wins
		System.out.println(Player2.getName()+ " Beats " + Player1.getName()  + " computer" +" You won!");
		player2Score++;
		break;
	case -1: // Computer wins
		System.out.println("Computer" +" Beats "+ Player1.getName() + " and " + Player2.getName() + " You Lost!");
		computerScore++;
		break;
	}
	numberOfGames++;
	if(player1Score==3)
	{
		System.out.println(Player1.getName()+" Won the game!");
		new Game();
	}
	if(player2Score==3)
	{
		System.out.println(Player2.getName()+" Won the game!");
		new Game();
	}
	if(computerScore==3)
	{
		System.out.println("Computer "+" Won the game!");
		new Game();
	}
	// Player 1 play again?
	if (Player1.playAgain()) {
		System.out.println();
		startGame();
	} 
	//Player 2 play again?
	if (Player2.playAgain()) {
		System.out.println();
		startGame();
	}
	else {
		System.out.println("Goodbye");
		//printStats();
	}
}
private int compareResult(int compareResult1, int compareResult2) {
	// TODO Auto-generated method stub
	return 0;
}

//Computet asks for player names
public void getplayerName() {
	Player1.askp1Name();
	Player2.askp2Name();
}
//Displays current game stats
public void printStats()
{
	System.out.println("Number of games played is "+numberOfGames);
	String player1Score = null;
	System.out.println(Player1.getName()+"'s score "+player1Score);
	String player2Score = null;
	System.out.println(Player2.getName()+"'s score "+player2Score);
	System.out.println("Computers score "+computerScore);
}
}

