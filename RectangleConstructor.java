import java.util.Scanner;

class RectangleBox {
    int length;
    int breadth;

    RectangleBox() {
        length = 1;
        breadth = 1;
    }

    RectangleBox(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}

public class RectangleConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        RectangleBox r1 = new RectangleBox();
        RectangleBox r2 = new RectangleBox(length, breadth);

        System.out.println("Rectangle 1 Area = " + r1.getArea());
        System.out.println("Rectangle 2 Area = " + r2.getArea());
        sc.close();
    }
}
