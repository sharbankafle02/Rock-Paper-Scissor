import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        String choice[]={"rock","paper","scissor"};
        String computerchoice;
        String playerchoice;
        String playAgain;
        System.out.println("*********");
        System.out.println("ROCK-PAPER-SCISSOR GAME");
        System.out.println("**********");
        do{
            System.out.println("Enter youe choice(rock/paper/scissor): ");
            playerchoice=scanner.nextLine().toLowerCase();
            if(!playerchoice.equals("paper") & !playerchoice.equals("rock") & !playerchoice.equals("scissor")){
                System.out.println("Please enter the valid choice!!!!");
            }
            computerchoice=choice[random.nextInt(0,3)];
            System.out.println("Player Choice: "+playerchoice);
            System.out.println("Computer Choice: "+computerchoice);
            if(playerchoice.equals(computerchoice)){
                System.out.println("It's a tie");
            }
            else if(playerchoice.equals("rock") &computerchoice.equals("scissor")){
                System.out.println("Yuu Won");
            }
            else if(playerchoice.equals("paper") & computerchoice.equals("rock")){
                System.out.println("You Won");
            }
            else if(playerchoice.equals("scissor") &computerchoice.equals("paper")){
                System.out.println("You Won");
            }
            else if(computerchoice.equals("paper") & playerchoice.equals("rock")){
                System.out.println("You Loose");
            }
            else if(computerchoice.equals("scissor") & playerchoice.equals("paper")){
                System.out.println("You Loose");
            }
            else if(computerchoice.equals("rock") & playerchoice.equals("scissor")){
                System.out.println("You Loose");
            }
            else{
                System.out.println("Invalid choice please choice the corret choice!!!");
            }
            System.out.println("Do you want to play again(yes/no): ");
            playAgain=scanner.nextLine().toLowerCase();
        }
        while(playAgain.equals("yes"));
        System.out.println("Thank you for playing the game!!!");
        scanner.close();
    }
}