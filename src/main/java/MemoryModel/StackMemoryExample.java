package MemoryModel;

public class StackMemoryExample {
    public static void main(String[] args) {
        doSomething();
    }

    public static void doSomething() {
        int v = 0; // Stored in Stack memory
        System.out.println(v);
    }
}
