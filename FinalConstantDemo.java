import java.util.Scanner;

public class FinalConstantDemo {
    public static void main(String[] args) {
        final double PI = 3.141592653589793;

        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;

        System.out.printf("Area = %.2f\n", area);
        sc.close();
    }
}
