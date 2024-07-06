// Java buzzwords are fundamental concepts and features in the Java programming language that highlight its strengths and capabilities. Here are some key Java buzzwords with examples:
// 1. **Simple**: Java's syntax is straightforward and easy to learn, similar to C++. Example:
//    ```java
//    System.out.println("Hello, World!");
//    ```

// 2. **Object-Oriented**: Java is based on objects, with classes and inheritance. Example:
//    ```java
//    class Car {
//        String model;
//        Car(String model) {
//            this.model = model;
//        }
//    }
//    Car car1 = new Car("Toyota");
//    ```

// 3. **Platform-Independent**: Java code runs on any system with a JVM. Example: Write and compile code on Windows, then run the bytecode on Linux without modification.

// 4. **Portable**: Java ensures consistent behavior across platforms. Example: A Java program written on Windows will run on any other platform with a JVM without modification.

// 5. **Secure**: Java provides a secure environment with features like the Java sandbox and bytecode verification. Example: Applets running in a browser are restricted from accessing the local file system.

// 6. **Robust**: Java has strong memory management and exception handling to reduce errors. Example:
//    ```java
//    try {
//        int division = 10 / 0;
//    } catch (ArithmeticException e) {
//        System.out.println("Division by zero is not allowed.");
//    }
//    ```

// 7. **Multithreaded**: Java supports concurrent execution of two or more threads. Example:
//    ```java
//    class MyThread extends Thread {
//        public void run() {
//            System.out.println("Thread running");
//        }
//    }
//    MyThread t1 = new MyThread();
//    t1.start();
//    ```

// 8. **Architecture-Neutral**: Java bytecode is designed to run on any processor architecture with the JVM. This makes Java programs hardware-independent.

// 9. **Interpreted**: Java code is compiled into bytecode, which is then interpreted by the JVM. This allows for cross-platform execution.

// 10. **High Performance**: The Just-In-Time (JIT) compiler translates bytecode into native machine code at runtime, improving performance.

// 11. **Distributed**: Java has APIs like Remote Method Invocation (RMI) and Enterprise JavaBeans (EJB) for building distributed applications. Example:
//     ```java
//     import java.rmi.Remote;
//     import java.rmi.RemoteException;

//     public interface MyRemote extends Remote {
//         String sayHello() throws RemoteException;
//     }
//     ```

// 12. **Dynamic**: Java programs can adapt by loading classes at runtime using reflection. Example:
//     ```java
//     Class<?> cls = Class.forName("com.example.MyClass");
//     ```

// These features make Java a versatile, powerful, and widely-used programming language.
// 1.	Q2) Java Standard Edition (Java SE):
// •	Purpose: Core functionality for general-purpose programming. It includes the essential libraries and APIs for developing desktop applications.
// •	Features: Basic language features, core APIs like java.util, java.io, java.net, and GUI development tools like Swing and JavaFX.
// •	Usage Example: Developing desktop applications, command-line tools, and utilities. For instance, a text editor or a financial calculator.
// 2.	Java Enterprise Edition (Java EE):
// •	Purpose: Large-scale, distributed, multi-tiered network applications. This edition builds on Java SE, providing additional libraries and APIs for enterprise features.
// •	Features: APIs for web services, servlets, JavaServer Pages (JSP), Enterprise JavaBeans (EJB), and support for web-based and transactional applications.
// •	Usage Example: Developing complex web applications and enterprise software such as an e-commerce platform, customer relationship management (CRM) systems, or enterprise resource planning (ERP) systems.
// 3.	Java Micro Edition (Java ME):
// •	Purpose: Development for small, resource-constrained devices like mobile phones and embedded systems.
// •	Features: A subset of Java SE features optimized for devices with limited resources. Includes APIs for user interfaces, networking, and storage tailored to the constraints of these devices.
// •	Usage Example: Creating applications for mobile phones (particularly feature phones), personal digital assistants (PDAs), and embedded devices like smartwatches or home appliances. Examples include simple mobile games or basic productivity apps.
// 4.	Java Card:
// •	Purpose: Running Java applications on smart cards and secure elements. These are small applications that require a high level of security and very limited resources.
// •	Features: A very stripped-down version of Java tailored for resource-constrained devices. It includes specialized APIs for cryptographic operations and secure data management.
// •	Usage Example: Developing applications for SIM cards, credit cards, and other smart cards used in secure transactions. For example, an application on a smart card that handles secure authentication and payment processing.
// These editions are designed to cater to different development needs, from desktop applications to enterprise solutions, mobile devices, and secure embedded systems. Each edition builds on the core features of Java while adding specific libraries and APIs to support their respective domains.
// Q3) Java achieves platform independence through a combination of its architecture and tools provided by the Java Development Kit (JDK) and Java Runtime Environment (JRE).
// Java's platform independence is primarily achieved through a combination of its architecture and the tools provided by the Java Development Kit (JDK) and Java Runtime Environment (JRE), as outlined in the illustration provided.
// 1.	Compilation to Bytecode: When Java source code is compiled using the JDK, it is translated into bytecode rather than platform-specific machine code. This bytecode is a low-level representation of the program that is designed to be platform-independent. This step ensures that Java programs are not tied to any specific hardware or operating system during the development phase.
// 2.	Java Virtual Machine (JVM): Each platform has its own implementation of the JVM. The JVM interprets the bytecode and translates it into platform-specific machine code at runtime. This translation happens dynamically, allowing Java applications to execute seamlessly on any system with a compatible JVM. The JVM essentially acts as an abstraction layer between the Java application and the underlying operating system, shielding the application from the differences in hardware and OS implementations.
// 3.	Standardized Libraries: Java's standard libraries, included in the JRE, provide a consistent set of APIs for tasks such as file I/O, networking, and GUI development. These libraries are implemented in platform-independent Java code, ensuring that Java applications can rely on a consistent set of functionalities regardless of the underlying platform.
// 4.	Write Once, Run Anywhere: The combination of compiling Java code to bytecode and the JVM's ability to interpret this bytecode on any operating system enables Java's famous "write once, run anywhere" capability. Developers can write Java code on one platform and expect it to run on any other platform with a compatible JVM installed, without the need for recompilation or modification.
// Overall, Java's platform independence is not solely reliant on one component but is rather a result of the synergy between the language's design principles, the JDK's compilation process, and the runtime environment provided by the JVM and JRE. This architecture ensures that Java applications can maintain consistency and portability across diverse computing environments.
// Q8)
import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select the shape for which you want to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Cone");
        System.out.println("5. Triangle");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + calculateCircleArea(radius));
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of the square: " + calculateSquareArea(side));
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of the rectangle: " + calculateRectangleArea(length, width));
                break;
            case 4:
                System.out.print("Enter the radius of the base of the cone: ");
                double coneRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double height = scanner.nextDouble();
                System.out.println("Area of the cone: " + calculateConeArea(coneRadius, height));
                break;
            case 5:
                System.out.print("Enter the base length of the triangle: ");
                double baseLength = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = scanner.nextDouble();
                System.out.println("Area of the triangle: " + calculateTriangleArea(baseLength, triangleHeight));
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }
        
        scanner.close();
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateConeArea(double radius, double height) {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
    
    public static double calculateTriangleArea(double baseLength, double height) {
        return 0.5 * baseLength * height;
    }
}

Q9) import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();
        
        if(isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while(number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
Q10) import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        if(isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
Q13)
1.	import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the entered year is a leap year
        if(isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions:
        // 1. Year is evenly divisible by 4 but not divisible by 100
        // 2. Year is divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
2.	import java.util.Scanner;

public class OddEvenChecker {
    public static boolean isEven(int number) {
        // A number is even if it's divisible by 2 without a remainder
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the entered number is odd or even
        if(isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }
}
3.	import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        int max = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The biggest number is: " + max);
        
        scanner.close();
    }
}
4.	import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
    
    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
5.	import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the count of Fibonacci numbers: ");
        int count = scanner.nextInt();
        
        System.out.print("Fibonacci series of count " + count + " is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
6.	import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        
        char grade = calculateGrade(score);
        System.out.println("Student grade: " + grade);
        
        scanner.close();
    }
    
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else {
            return 'F'; // Fail
        }
    }
}
7.	import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number to display its multiplication table: ");
        int number = scanner.nextInt();
        
        displayMultiplicationTable(number);
        
        scanner.close();
    }
    
    public static void displayMultiplicationTable(int number) {
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
Q14) import java.util.Scanner;  
public class FindSquareRootExample1   
{  
public static void main(String[] args)    
{   
System.out.print("Enter a number: ");  
//creating object of the Scanner class  
Scanner sc = new Scanner(System.in);  
//reading a number form the user  
int n = sc.nextInt();  
//calling the method and prints the result  
System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
}  
//user-defined method that contains the logic to find the square root  
public static double squareRoot(int num)   
{  
//temporary variable  
double t;  
double sqrtroot=num/2;  
do   
{  
t=sqrtroot;  
sqrtroot=(t+(num/t))/2;  
}   
while((t-sqrtroot)!= 0);  
return sqrtroot;  
}
}



