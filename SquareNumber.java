import java.util.Scanner;

public class SquareNumber {
    //input a number i and get output (i)^2
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number you want to square");
        int num = input1.nextInt();
        System.out.println("square of "+ num + " is = " + ( num * num ) );
        Scanner i2 = new Scanner(System.in);
        System.out.print("Do you want to continue for getting a series of square limits enter (y/n)");
        String y = i2.next();
        if(y.equals("y")) {
            Scanner i3 = new Scanner(System.in);
            System.out.print("Enter a number you want to square's from one ");
            int seq = i3.nextInt();
            for(int t=1 ; t<=seq; t++){
                System.out.println("square of "+ t + " is = " + ( t * t ) );
            }
        } else if(y.equals("n")){
            System.out.println(" hope we spend some more time in future bye ): !!!!");
        } else {
            System.out.println("Enter a valid input (y or n)");
        }

        System.out.println("thank you!!!!!!!");

    }

 }
