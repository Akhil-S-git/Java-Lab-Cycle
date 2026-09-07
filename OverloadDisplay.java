import java.util.Scanner;

public class OverloadDisplay {
    void display(int num) {
        System.out.println("Integer : " + num);
    }

    void display(double num) {
        System.out.println("Double : " + num);
    }

    void display(String str) {
        System.out.println("String : " + str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Integer: ");
        int intVal = sc.nextInt();
        System.out.print("Double: ");
        double doubleVal = sc.nextDouble();
        sc.nextLine();
        System.out.print("String: ");
        String strVal = sc.nextLine();

        OverloadDisplay obj = new OverloadDisplay();
        obj.display(intVal);
        obj.display(doubleVal);
        obj.display(strVal);
        sc.close();
    }
}
