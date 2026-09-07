import java.util.Scanner;

public class OverloadArea {
    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int side = sc.nextInt();
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        OverloadArea obj = new OverloadArea();
        System.out.println("Area of Square = " + obj.area(side));
        System.out.println("Area of Rectangle = " + obj.area(length, breadth));
        sc.close();
    }
}
