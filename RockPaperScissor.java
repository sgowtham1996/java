import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1:choose rock,scissor,paper");
        String playerOne = input.next();
        System.out.print("Player 2:choose rock,scissor,paper");
        String playerTwo = input.next();

        if ((playerOne.equals("rock") && playerTwo.equals("scissor") || (playerOne.equals("scissor") && playerTwo.equals("paper") || (playerOne.equals("paper") && playerTwo.equals("rock"))))) {
            System.out.print("player 1 wins!!!");
        } else if((playerOne.equals("scissor") && playerTwo.equals("rock") || (playerOne.equals("paper") && playerTwo.equals("scissor") || (playerOne.equals("rock") && playerTwo.equals("paper"))))){
            System.out.print("player 2 wins!!!");
        } else {
            System.out.print("Enter a valid input rock or paper or scissor");
        }
        }
    }


