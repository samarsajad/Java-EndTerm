An array is a collection of elements, each identified by an array index or key. It is a linear data structure that stores elements in contiguous memory locations. Arrays allow efficient random access to elements using their indices, making them useful for various applications where quick access to data is required.
Characteristics
1.	Fixed Size: The size of an array is fixed at the time of creation and cannot be changed dynamically.
2.	Homogeneous Elements: Arrays store elements of the same data type.
3.	Random Access: Elements in an array can be accessed directly using their index, providing O(1) time complexity for access operations.
4.	Contiguous Memory: Elements are stored in contiguous memory locations, which can lead to efficient cache utilization.
Program
java
Copy code
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial array and its size
        int[] arr = new int[10];
        int n = 5; // Initial number of elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Read the element to be inserted and the position
        System.out.print("Enter the element to be inserted: ");
        int element = scanner.nextInt();
        System.out.print("Enter the position at which to insert the element: ");
        int position = scanner.nextInt();

        // Validate the position
        if (position < 0 || position > n) {
            System.out.println("Invalid position! Position should be between 0 and " + n);
        } else {
            // Shift elements to the right
            for (int i = n; i > position; i--) {
                arr[i] = arr[i - 1];
            }
            // Insert the element
            arr[position] = element;
            n++; // Increase the number of elements

            // Print the updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

