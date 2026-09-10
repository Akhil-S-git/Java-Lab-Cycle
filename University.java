abstract class StudentEvaluation {
    String name;
    int rollNo;
    int marks1, marks2, marks3;

    // Constructor
    StudentEvaluation(String name, int rollNo, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Concrete method
    void displayDetails() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }

    // Abstract methods
    abstract int calculateTotal();
    abstract void displayGrade();
}

// UG Course
class UGCourseEvaluation extends StudentEvaluation {

    UGCourseEvaluation(String name, int rollNo, int m1, int m2, int m3) {
        super(name, rollNo, m1, m2, m3);
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    void displayGrade() {
        int total = calculateTotal();

        if (total >= 240)
            System.out.println("Grade   : A");
        else if (total >= 180)
            System.out.println("Grade   : B");
        else if (total >= 120)
            System.out.println("Grade   : C");
        else
            System.out.println("Grade   : D");
    }
}

// PG Course
class PGCourseEvaluation extends StudentEvaluation {

    PGCourseEvaluation(String name, int rollNo, int m1, int m2, int m3) {
        super(name, rollNo, m1, m2, m3);
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    void displayGrade() {
        int total = calculateTotal();

        if (total >= 270)
            System.out.println("Grade   : A");
        else if (total >= 210)
            System.out.println("Grade   : B");
        else if (total >= 150)
            System.out.println("Grade   : C");
        else
            System.out.println("Grade   : D");
    }
}

// Certificate Course
class CertificateCourseEvaluation extends StudentEvaluation {

    CertificateCourseEvaluation(String name, int rollNo, int m1, int m2, int m3) {
        super(name, rollNo, m1, m2, m3);
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    void displayGrade() {
        int total = calculateTotal();

        if (total >= 210)
            System.out.println("Grade   : A");
        else if (total >= 150)
            System.out.println("Grade   : B");
        else if (total >= 90)
            System.out.println("Grade   : C");
        else
            System.out.println("Grade   : D");
    }
}

// New course type
class DiplomaCourseEvaluation extends StudentEvaluation {

    DiplomaCourseEvaluation(String name, int rollNo, int m1, int m2, int m3) {
        super(name, rollNo, m1, m2, m3);
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    void displayGrade() {
        int total = calculateTotal();

        if (total >= 240)
            System.out.println("Grade   : A");
        else if (total >= 180)
            System.out.println("Grade   : B");
        else if (total >= 120)
            System.out.println("Grade   : C");
        else
            System.out.println("Grade   : D");
    }
}

// Main class
public class University {
    public static void main(String[] args) {

        StudentEvaluation[] students = new StudentEvaluation[5];

        students[0] = new UGCourseEvaluation("Arun", 101, 80, 85, 90);
        students[1] = new PGCourseEvaluation("Anu", 102, 90, 85, 95);
        students[2] = new CertificateCourseEvaluation("Rahul", 103, 70, 75, 80);
        students[3] = new UGCourseEvaluation("Meera", 104, 60, 70, 65);
        students[4] = new DiplomaCourseEvaluation("Ravi", 105, 85, 80, 90);

        for (int i = 0; i < students.length; i++) {

            System.out.println("\n--------------------");

            students[i].displayDetails();

            System.out.println("Total   : " + students[i].calculateTotal());

            students[i].displayGrade();
        }
    }
}