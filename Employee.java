import java.util.Scanner;

public class Employee
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BAsic Salary: ");

        double basicSalary = sc.nextDouble();

        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.15;
        double grossSalary = basicSalary + da + hra;

        System.out.println("DA = " + (int)da);
        System.out.println("HRA = " + (int)hra);
        System.out.println("Gross Salary = " + (int)grossSalary);
    }
}