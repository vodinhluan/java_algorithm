import java.util.*;

public class Heap {
    private ArrayList<Integer> heap; // tao ds heap

    public Heap() {   
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        index1 = heap.set(index1, heap.get(index2));
        index2 = heap.set(index2, temp);
    }
    
}
