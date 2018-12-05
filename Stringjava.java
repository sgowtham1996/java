public class Stringjava {
    public static void main(String[] args) {
        System.out.println("******");
        print(4);
    }
    public static void print(int n) {
        if (n == 1) {
            System.out.print("< bc >");
        } else {
            System.out.print("p(" + n + ") -> ");
            print(n-1);
        }
    }
}



