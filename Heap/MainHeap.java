public class MainHeap {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println("Heap before removal: " + myHeap.getHeap());
        System.out.println("Removed max value: " + myHeap.remove());
        System.out.println("Heap after removal: " + myHeap.getHeap());
    }
}
