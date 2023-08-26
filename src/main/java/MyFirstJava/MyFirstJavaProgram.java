package MyFirstJava;

public class MyFirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello, this is my first java program");
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration # " + i);
        }
        System.out.println("");

        int j = 0;
        while (j < 5) {
            System.out.println("Iteration # " + j);
            j++;
        }
        System.out.println("");

        int salaries[] = { 50000, 75340, 110500, 98270, 39400 };
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("The element at index " + i + " has the value of " + salaries[i]);
        }
    }
}