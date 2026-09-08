import java.util.Scanner;

class PersonDetails {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class AccessControlDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        PersonDetails person = new PersonDetails();
        person.setName(name);
        person.setAge(age);

        System.out.println("Student Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
        sc.close();
    }
}
