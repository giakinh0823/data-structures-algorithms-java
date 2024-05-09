package gurucoding.org.hashTable;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.set("nails", 100);
        hashTable.set("title", 50);
        hashTable.set("lumber", 80);

        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        System.out.println(hashTable.get("nails"));
        System.out.println(hashTable.get("lumber"));

        hashTable.printTable();
        hashTable.keys().forEach(System.out::println);
    }

}
