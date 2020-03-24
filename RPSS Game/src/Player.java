import java.util.Random;
import java.util.Scanner;



	

public class Player {  
	
	
	public class Player1 {
		public int getInput() {
			Random random = new Random();
			int input = random.nextInt(3) + 1;
			return input;
		}	
//Player Input
	private String Player1;
	Scanner sc1 = new Scanner(System.in);
	
	public String p1Name() {
		return Player1;
	}
	
	public void setp1Name(String p1Name, String Player1)	{
		this.Player1 = Player1;
	}
	
	public void askp1Name()	{
		System.out.println("What is the name of the first player?");
		Player1 = sc1.next();
	
	}
	}
	public class Player2 {
		public int getInput3() {
			Random random = new Random();
			int input = random.nextInt(3) + 1;
			return input;
		}
	private String Player2;
	Scanner sc2 = new Scanner(System.in);
	
	public String p2Name() {
		return Player2;
	}
	
	public void setp2Name(String p2Name, String Player2)	{
		this.Player2 = Player2;
	}
	
	public void askp2Name()	{
		System.out.println("What is the name of the second player?");
		Player2 = sc2.next();
	}
	
	public int getInput1()	{
		System.out.println("Select (1)ROCK, (2)PAPER, (3)SCISSORS OR (4)SAW");
		
		String input = sc2.next();
		input = input.toUpperCase();
		char c=input.charAt(0);
		
		if (c == '1')
			return GameDriver.ROCK;
		else if (c == '2')
			return GameDriver.PAPER;
		else if (c == '3')
			return GameDriver.SCISSORS;
		else if (c == '4')
			return GameDriver.SAW;
		else {
			getInput1();
			return 0;
		}
	}
	
	public class Computer{
		public int getInput2() {
			Random random = new Random();
			int input = random.nextInt(3) + 1;
			return input;
		}
	}
	

	
	
	

	
	}

	
	public boolean playAgain() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to play again?");
		String userInput = sc.nextLine();
		userInput = userInput.toUpperCase();
		return userInput.charAt(0) == 'Y';
	}


	public int getInput() {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	public void askp1Name() {
		// TODO Auto-generated method stub
		
	}


	public void askp2Name() {
		// TODO Auto-generated method stub
		
	}
}
	
	

