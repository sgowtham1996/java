import java.util.*;

public class Pythagoras {
    public static void main(String[] args){
        System.out.print("enter value for a : ");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        System.out.print("enter value for b : ");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        double asq = Math.pow(a,2);
        double bsq = Math.pow(b,2);
        double c = Math.sqrt(asq + bsq);
        System.out.println("Answer of Pythagoras theorem of a and b is " + c);

    }
}
