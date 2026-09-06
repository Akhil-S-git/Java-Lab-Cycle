public class GarbageCollectionMultiple {
    GarbageCollectionMultiple() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {
        GarbageCollectionMultiple obj1 = new GarbageCollectionMultiple();
        GarbageCollectionMultiple obj2 = new GarbageCollectionMultiple();

        obj1 = null;
        obj2 = null;

        System.out.println("Garbage Collection Requested");
        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
