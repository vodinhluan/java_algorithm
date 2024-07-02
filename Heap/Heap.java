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

    private int parent(int index) {
        return (index-1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        index1 = heap.set(index1, heap.get(index2));
        index2 = heap.set(index2, temp);
    }

    public void insert (int value) {
        heap.add(value);
        int current = heap.size() - 1;
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // remove max value?
    public Integer remove() {
        if (heap.size() == 0) return null;
        
        if (heap.size() == 1) {
            heap.remove(0);
        }
        
        // maxvalue = so dau tien cua heap
        int maxValue = heap.get(0);
        // remove value cuoi cung va di chuyen sang index dau tien
        heap.set(0, heap.remove(heap.size()-1));
        // chỉ mới xóa max value và dịch chuyển value cuối cùng lên đầu tiên thôi
        // chưa cân bằng lại heap
        sinkDown(0);
        return maxValue;
    }
    
    // dùng để cân bằng lại heap sau remove
    private void sinkDown(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        // Nếu node lớn nhất không phải là node hiện tại
        if (largest != index) {
            swap(index, largest);
            sinkDown(largest); // Tiếp tục sinkDown từ vị trí mới
        }
    }
}
