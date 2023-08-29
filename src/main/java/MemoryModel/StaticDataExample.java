package MemoryModel;

public class StaticDataExample {
    int globalVar = 3; // Stored in Static Data memory

    public int showVar() {
        return globalVar;
    }

    public static void main(String[] args) {
        StaticDataExample instance = new StaticDataExample();
        System.out.println(instance.showVar());
    }
}
