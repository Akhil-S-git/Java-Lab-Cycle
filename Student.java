import java.util.Scanner;
public class Student{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Roll no: ");
        int roll = s.nextInt();
        s.nextLine();
        System.out.print("Course: ");
        String course = s.nextLine();
        System.out.print("Percentage: ");
        double per = s.nextDouble();
        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + per);
        
    }
}