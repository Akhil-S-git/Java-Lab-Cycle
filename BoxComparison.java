import java.util.Scanner;

class BoxData {
    int length;
    int width;
    int height;

    BoxData(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume() {
        return length * width * height;
    }
}

public class BoxComparison {
    static void displayLargerBox(BoxData b1, BoxData b2) {
        int vol1 = b1.volume();
        int vol2 = b2.volume();

        if (vol1 > vol2) {
            System.out.println("Larger Box Volume = " + vol1);
        } else {
            System.out.println("Larger Box Volume = " + vol2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Box1 (length width height): ");
        int l1 = sc.nextInt();
        int w1 = sc.nextInt();
        int h1 = sc.nextInt();

        System.out.print("Box2 (length width height): ");
        int l2 = sc.nextInt();
        int w2 = sc.nextInt();
        int h2 = sc.nextInt();

        BoxData box1 = new BoxData(l1, w1, h1);
        BoxData box2 = new BoxData(l2, w2, h2);

        displayLargerBox(box1, box2);
        sc.close();
    }
}
