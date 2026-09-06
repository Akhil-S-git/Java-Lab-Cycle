import java.util.Scanner;

public class ThisConstructorDemo {
    String name;
    int age;

    ThisConstructorDemo() {
        System.out.println("Default Constructor");
    }

    ThisConstructorDemo(String name, int age) {
        this();
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        ThisConstructorDemo obj = new ThisConstructorDemo(name, age);
        obj.display();
        sc.close();
    }
}
