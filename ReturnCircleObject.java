import java.util.Scanner;

class CircleRecord {
    double radius;
    double area;

    CircleRecord(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }
}

public class ReturnCircleObject {
    static CircleRecord getCircle(double radius) {
        double area = Math.PI * radius * radius;
        return new CircleRecord(radius, area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        CircleRecord circle = getCircle(radius);

        System.out.println("Radius = " + circle.radius);
        System.out.printf("Area = %.2f\n", circle.area);
        sc.close();
    }
}
