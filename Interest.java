import java.util.Scanner;
public class Interest{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Principal: ");
        int p = s.nextInt();
        System.out.print("Rate: ");
        int r = s.nextInt();
        System.out.print("Time: ");
        int t = s.nextInt();
        double interst = (p*r*t)/100;
        System.out.print("Simple Interest = "+interst+"\nAmount = "+(p+interst));
    }
}