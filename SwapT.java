import java.util.Scanner;

public class SwapT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}