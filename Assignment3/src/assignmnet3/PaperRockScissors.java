package assignmnet3;

//packages to import
import java.util.*;

public class PaperRockScissors 
{ //begin class PaperRockScissors

	public static void main(String[] args) 
	{ //begin main
		Random rand = new Random(); //generates a new random integer
		
		int pcMove, npcMove, win = 0;
		String result = "", move = "", move1 = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("scissors (0), rock(1), paper(2): ");
		pcMove = input.nextInt();
		
		npcMove = rand.nextInt(3) + 1; //generates the computer's move against the player
		
		if (pcMove == npcMove) //this block of code checks for a tie
		{ //begin if(pcMove == npcMove)
			win = 2;
			result = "tied";		
		} //endif(pcMove == npcMove)
		
		else if (pcMove == 0 &&  npcMove == 2) //these blocks of code checks for a win
		{ //begin else if(pcMove == 0 && npcMove == 2)
			win = 1;
			move = "scissors";
			move1 = "paper";
			result = "won";
		} //end else if(pcMove == 0 && npcMove == 2)
		else if (pcMove == 1 && npcMove == 0) 
		{ //begin else if(pcMove == 1 && npcMove == 0)
			win = 1;
			move = "rock";
			move1 = "scissors";
			result = "won";
		} //end else if(pcMove == 1 && npcMove == 0)
		else if (pcMove == 2 && npcMove == 1) 
		{ // begin else if(pcMove == 2 && npcMove == 1)
			win = 1;
			move = "rock";
			move1 = "paper";
			result = "won";
		} //end else if(pcMove == 2 && npcMove == 1)
		else if (pcMove == 0 && npcMove == 1) //these blocks of code check for a loss 
		{ //begin else if(pcMove == 0 && npcMove == 1)
			win = 0;
			move = "scissors";
			move1 = "rock";
			result = "lost";
		} //end else if(pcMove == 0 && npcMove == 1)
		else if (pcMove == 1 && npcMove == 2 ) 
		{ //begin else if(pcMove == 1 && npcMOve == 2)
			win = 0;
			move = "rock";
			move1 = "paper";
			result = "lost";
		} // end else if(pcMove == 1 && npcMove == 2)
		else if (pcMove == 2 && npcMove == 0) 
		{ //begin else if(pcMove == 2 && npcMove == 0)
			win = 0;
			move = "paper";
			move1 = "rock";
			result = "lost";
		} //end else if(pcMove == 2 && npcMove == 0)
	
		switch(win)
		{ //begin switch(win)
			case 0:
			System.out.println("You "+result+"! "+move1+" beats "+move+".");
			break;
			case 1:
			System.out.println("You "+result+"! "+move+" beats "+move1+".");
			break;
			case 2:
			System.out.println("You "+result+"!");
			break;
		} //end switch(win)

	} //end main

} //end class PaperRockScissors