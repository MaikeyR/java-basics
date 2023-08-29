package MemoryModel;

public class HeapMemoryExample {
    public static void main(String[] args) {
        int id = 1;
        String pName = "Rick";
        Person p = new Person(id, pName); // Instance created in Heap memory
    }
}