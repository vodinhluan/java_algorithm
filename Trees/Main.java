package Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("\nRoot: "+myBST.root.value);
        System.out.println("\nRoot->Left: "+myBST.root.left.value);
        System.out.println("\nRoot->Right: "+myBST.root.right.value);
        myBST.rDelete(21);

        System.out.println("\nRoot: "+myBST.root.value);
        System.out.println("\nRoot->Left: "+myBST.root.left.value);
        System.out.println("\nRoot->Right: "+myBST.root.right.value);

    }
}
