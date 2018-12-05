import java.util.*;
public class OddsOrEvens{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.println("What is your name?");
        String name = input.next();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Hi " + name + " which do you choose? (O)dds or (E)vens?");
        String choice = input2.next();
        if(choice.equals("O")){
            System.out.println(name +"has picked odds! The computer will be evens.");

        }else if(choice.equals("E")) {
            System.out.println(name +" has picked evens! The computer will be odds.");
        }else{
            System.out.println("please enter a valid input capital (O or E) only ");
        }
        Scanner input3 = new Scanner(System.in);
        System.out.print("How many “fingers” do you put out?");
        int fingers = input3.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("Computer have choosen : "+computer);
        int sum = fingers + computer;
        System.out.println("sum of the output is " + sum);
        if(sum % 2 == 0){
            System.out.println(sum + " is even");
        }else{
            System.out.println(sum + " is odd");
        }if((sum % 2 == 0) && choice.equals("E") || (sum % 2 == 1) && choice.equals("O")){
            System.out.println(name +" has won");
        }else{
            System.out.println("Computer has won try next time");
        }
    }
}


