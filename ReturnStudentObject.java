import java.util.Scanner;

class StudentRecord {
    String name;
    int mark;

    StudentRecord(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class ReturnStudentObject {
    static StudentRecord createStudent(String name, int mark) {
        return new StudentRecord(name, mark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Mark: ");
        int mark = sc.nextInt();

        StudentRecord s = createStudent(name, mark);

        System.out.println("Student Name : " + s.name);
        System.out.println("Mark : " + s.mark);
        sc.close();
    }
}
