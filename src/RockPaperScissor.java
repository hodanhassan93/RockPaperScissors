import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		boolean play=true;
		
		
		while(play) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many rounds you would like to play (1-10): ");
		int rounds=scanner.nextInt();
		int ties=0;
		int compWins=0;
		int userWins=0;
		
		
		if (rounds>= 1 && rounds<=10) {	 
			for (int counter = 1; counter <= rounds; counter++) {
             System.out.println("Round " + counter);
             int uChoice= userChoice();
             if (uChoice>3 || uChoice< 1) {
          		System.out.println("invalid input");
          	}
             int cChoice= randomChoice();
             	
             if (uChoice == cChoice) {
                 System.out.println("tie!");
                 ties++;
             } else if ((uChoice == 1 && cChoice == 3) ||
                     (uChoice == 2 && cChoice == 1) ||
                     (uChoice == 3 && cChoice == 2)) {
                 System.out.println("user won this round!");
                 userWins++;
             } else {
                 System.out.println("Computer won this round!");
                 compWins++;
             }
             
			}

            System.out.println("Game Over!");
            System.out.println("Number of ties: " + ties);
            System.out.println("Number of user wins: " + userWins);
            System.out.println("Number of computer wins: " + compWins);

            String overallWinner = winner(userWins, compWins);
            System.out.println("Overall Winner: " + overallWinner);

            play = playAgain();
            System.out.println();
        } else {
            System.out.println("Invalid number of rounds. Please try again.");
        }
    }

    System.out.println("Thanks for playing!");
}
		

	
	
	
    public static int userChoice() {
    	Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your choice (1: Rock, 2: Paper, 3:  Scissors): ");
        return scanner.nextInt();
    }
    
    public static int randomChoice() {
    	Random random=new Random();
        return random.nextInt(3) + 1;
    }
    
    public static String winner(int userWins, int compWins) {
        if (userWins > compWins) {
            return "User won";
        } else if (compWins > userWins) {
            return "Computer won";
        } else {
            return "tie!";
        }
    }
    
    public static boolean playAgain() {
    	Scanner scanner=new Scanner(System.in);
        System.out.print("Would you like to play again? (Yesor No): ");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("Yes");
    }
    
}
