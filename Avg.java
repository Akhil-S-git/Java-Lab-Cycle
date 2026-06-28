import java.util.Scanner;
public class Avg{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Number 1: ");
        int n1 = s.nextInt();
        System.out.print("Number2: ");
        int n2 = s.nextInt();
        System.out.print("Number 3: ");
        int n3 = s.nextInt();
        double avg = (n1+n2+n3)/3;
        System.out.print("Average: "+avg);
    }
}