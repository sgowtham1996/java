import java.util.Scanner;

public class Nestedloop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you want to form pyramid till :   ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++) {
            for(int j=1; j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
