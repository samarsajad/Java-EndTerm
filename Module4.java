//Module 4
Q4)
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result = new int[rows][columns];

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;

        int[][] result = new int[rows1][columns2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Q7)
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class ListCreationExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        // Display ArrayList
        System.out.println("ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Display Vector
        System.out.println("\nVector:");
        for (String item : vector) {
            System.out.println(item);
        }

        // Display Stack
        System.out.println("\nStack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
Output
ArrayList:
Apple
Banana
Orange

Vector:
Red
Green
Blue

Stack:
Three
Two
One
Q8)
import java.util.ArrayList;
import java.util.List;

public class LetterListExample {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();

        // Adding letters to the list
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');

        // Displaying the list
        System.out.println("Letters in the list:");
        System.out.println(letters);

        // Removing a letter
        char removedLetter = letters.remove(2); // Removing letter at index 2 (C)
        System.out.println("\nRemoved Letter: " + removedLetter);

        // Finding the size of the list
        int size = letters.size();
        System.out.println("Size of the list: " + size);
    }
}
Output 
Letters in the list:
[A, B, C, D]

Removed Letter: C
Size of the list: 3

