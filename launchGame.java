//THIS IS A 'GUESSER GAME'
//OBJECTIVE - A guesser will give any number and will tell to umpire.
//umpire will hold this number with himself,
//then he will take inputs from 3 players to guess the correct number.
//the player who gets the correct number wins the game 


import java.util.Scanner;


class Guesser
{
    int gnumGuess;
    public int guessNumber() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser, Guess The Number ");
        gnumGuess = sc.nextInt();
        return gnumGuess ;
    }

    
} 
class Players
{
    int numGuess;

    public int guessNumber() 
    {
        Scanner sc = new Scanner(System.in);
    
            System.out.println("Hey player kindly guess The Number ");
            numGuess = sc.nextInt();
        
        return numGuess;
    }

}
class Umpire
{
    int numGuess;
    int numP1;
    int numP2;
    int numP3;

    public void numFromGuesser() 
    {
        Guesser guesser = new Guesser();
        numGuess = guesser.guessNumber();
    }
    public void numFromPlayers() 
    {
        Players p1 = new Players();
        Players p2 = new Players();
        Players p3 = new Players();

        numP1  = p1.guessNumber();
        numP2  = p2.guessNumber();
        numP3  = p3.guessNumber();

       
    }

   

    public void result() 
    {
     if(numGuess==numP1)
     {
        if(numGuess==numP2 && numGuess==numP3)
        {
            System.out.println("All players won the game...!!");
        }
        else if(numGuess==numP2)
        {
            System.out.println("Players 1 and 2 are the winners");
        }
        else if (numGuess==numP3)
        {
            System.out.println("Players 1 and 3 arre the winners");
        }
      else{
        System.out.println("Player 1 is the winner");
      }
     }
     else if(numGuess==numP2)
    
     {
        if(numGuess==numP3){
            System.out.println("Players 1 and 3 are the winners");
        }
        else{
            System.out.println("Player 2 is the winner");
        }
     }
     else if(numGuess==numP3)
     {
        System.out.println("Player 3 is the winner");
     }
     else{
        System.out.println("Loosers.....!!!");
     }
    }
}
public class launchGame
{
    public static void main(String[] args) 
    {
        Umpire u = new Umpire();
        u.numFromGuesser();
        u.numFromPlayers();
        u.result();     
    }
}