package Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(12);
        myBST.insert(7);
        myBST.insert(20);
        myBST.insert(2);
        myBST.insert(11);
        myBST.insert(13);

        myBST.insert(38);

        System.out.println(myBST.root.left.right.value);
        System.out.println(myBST.contains(2));
    }
}
