public class CountObjectsDemo {
    static int count = 0;

    CountObjectsDemo() {
        count++;
    }

    public static void main(String[] args) {
        CountObjectsDemo obj1 = new CountObjectsDemo();
        CountObjectsDemo obj2 = new CountObjectsDemo();
        CountObjectsDemo obj3 = new CountObjectsDemo();

        System.out.println("Objects Created : " + count);
    }
}
