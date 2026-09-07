import java.util.Scanner;

class StudentInfo {
    String name;
    int rollNo;

    StudentInfo(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class PassObjectStudent {
    void displayStudent(StudentInfo s) {
        System.out.println("Student Name : " + s.name);
        System.out.println("Roll No : " + s.rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();

        StudentInfo student = new StudentInfo(name, rollNo);
        PassObjectStudent obj = new PassObjectStudent();
        obj.displayStudent(student);
        sc.close();
    }
}
