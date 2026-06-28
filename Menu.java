import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        int result = 0;

        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}