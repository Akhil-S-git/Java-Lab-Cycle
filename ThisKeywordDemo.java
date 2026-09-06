import java.util.Scanner;

public class ThisKeywordDemo {
    String name;
    int age;

    ThisKeywordDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        ThisKeywordDemo student = new ThisKeywordDemo(name, age);
        student.display();
        sc.close();
    }
}
