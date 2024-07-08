package LinkedList;
// head tail node

class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Constructor
    LinkedList() {
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
        }
    }

    // Remove a node with a specific value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found in the list");
        } else {
            current.next = current.next.next;
        }
    }

    // Print all nodes in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Print the list
        System.out.println("Linked list:");
        list.printList();

        // Remove an element from the list
        list.remove(3);

        // Print the list again
        System.out.println("Linked list after removing 3:");
        list.printList();
    }
}

