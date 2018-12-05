import java.util.Scanner;
public class module {
    public static void Greetings(){
        System.out.print("Welcome to vacation planner!");
        Scanner input= new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input.next();
        String place = input.next();
        System.out.print("Nice to meet you " + name +" ,where are you planning to? "+ place);
        System.out.print("Great!"+place+" city sounds like a great trip");
    }
}
