package GarbageCollection;

import java.util.ArrayList;
import java.util.List;

public class GCDemo2 {
    private static int instanceCount = 0;
    private int instanceNumber;
    private String value;

    private static List<Integer> finalizedObjects = new ArrayList<>();

    public GCDemo2() {
        instanceCount++;
        instanceNumber = instanceCount;
        System.out.println("Creating object " + instanceNumber);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void finalize() {
        finalizedObjects.add(instanceNumber);
        System.out.println("Object " + instanceNumber + " has been collected by the garbage collector!");
    }

    public static void main(String args[]) {
        System.out.println("Run 1 started");

        GCDemo2[] objects1 = new GCDemo2[10];

        for (int i = 0; i < objects1.length; i++) {
            objects1[i] = new GCDemo2();
        }

        objects1[3].setValue("Hello, World!");
        objects1[5].setValue("Hello, World!");
        objects1[7].setValue("Hello, World!");

        System.gc();

        System.out.println("\nObjects collected by GC in Run 1: " + finalizedObjects);
        finalizedObjects.clear();

        System.out.println("\nRun 2 started");

        GCDemo2[] objects2 = new GCDemo2[10];

        for (int i = 0; i < objects2.length; i++) {
            objects2[i] = new GCDemo2();
        }

        // Leave some objects without setting to null
        objects2[4] = null;
        objects2[6] = null;
        objects2[8] = null;

        System.gc();

        System.out.println("\nObjects collected by GC in Run 2: " + finalizedObjects);
    }
}
