import java.util.Scanner;
public class prac {
    public static void main(String[] args){
        System.out.print("Welcome to vacation planner!");
        Greetings();
        budget();
    }
    public static void Greetings(){
        Scanner input1= new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input1.nextLine();
        Scanner input2= new Scanner(System.in);
        System.out.print("where are you planning to? ");
        String place = input2.nextLine();
        System.out.println("Nice to meet you "+ name+" ,you are travelling to "+ place);
        System.out.println("Great!"+place+" city sounds like a great trip");
    }
    public static void budget(){
        Scanner input1= new Scanner(System.in);
        System.out.print("How many days are you planning to spend on your trip?");
        String days = input1.nextLine();
        Scanner input2= new Scanner(System.in);
        System.out.print("How much money,in USD, are you planning to spend on your trip?");
        String money = input2.nextLine();
        Scanner input3= new Scanner(System.in);
        System.out.print("what is the three letter currency symbol for your travel destination?");
        String symbol = input3.nextLine();
        Scanner input4= new Scanner(System.in);
        String many = input4.nextLine();
        System.out.print("How many "+symbol+" are in 1 USD" +many );

    }
}