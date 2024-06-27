// liên kết đôi
// prev data next

class Node {
    int data;
    Node prev;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Constructor
    DoublyLinkedList() {
        this.head = null;
    }

    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Remove a node with a specific value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found in the list");
        } else {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    // Print all nodes in the list from head to tail
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Print all nodes in the list from tail to head
    public void printListReverse() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Print the list from head to tail
        System.out.println("Doubly linked list (head to tail):");
        list.printList();

        // Print the list from tail to head
        System.out.println("Doubly linked list (tail to head):");
        list.printListReverse();

        // Remove an element from the list
        list.remove(3);

        // Print the list again from head to tail
        System.out.println("Doubly linked list after removing 3 (head to tail):");
        list.printList();

        // Print the list again from tail to head
        System.out.println("Doubly linked list after removing 3 (tail to head):");
        list.printListReverse();
    }
}