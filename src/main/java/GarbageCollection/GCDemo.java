package GarbageCollection;

import java.util.ArrayList;
import java.util.List;

public class GCDemo {
    public static void main(String[] args) {
        System.out.println("Memory Usage Before GC:");
        printMemoryInfo();

        // Create a list to hold objects
        List<Object> objects = new ArrayList<>();

        // Create a million objects and add them to the list
        for (int i = 0; i < 1000000; i++) {
            objects.add(new Object());
        }

        System.out.println("Memory Usage After Object Creation:");
        printMemoryInfo();

        // Suggest to the JVM to run the garbage collector
        System.gc();

        System.out.println("Memory Usage After GC:");
        printMemoryInfo();
    }

    public static void printMemoryInfo() {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();

        System.out.println("Free Memory: " + freeMemory);
        System.out.println("Total Memory: " + totalMemory);
        System.out.println("Max Memory: " + maxMemory);
    }
}
