package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(7);
        listOfNumbers.add(8);

        listOfNumbers.forEach((num) -> {
            System.out.println(num);
            System.out.println(num);
        });
    }
}
