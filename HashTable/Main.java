public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("abc", 100);
        myHashTable.set("xyz", 50);
        myHashTable.set("qwe", 69);
        myHashTable.set("johncena", 89);
        myHashTable.printTable();

        int value = myHashTable.get("johncena");
        System.out.println("Value = " +value);


    }
}
