//Module 2
Q1) import java.util.Scanner;

class Account {
    protected int accNo;
    protected String name;
    protected int age;
    protected String gender;
    protected String accType;
    protected double total;

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        accNo = scanner.nextInt();
        System.out.println("Enter Name:");
        name = scanner.next();
        System.out.println("Enter Age:");
        age = scanner.nextInt();
        System.out.println("Enter Gender:");
        gender = scanner.next();
        System.out.println("Enter Account Type:");
        accType = scanner.next();
        System.out.println("Enter Initial Balance:");
        total = scanner.nextDouble();
        scanner.close();
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + total);
    }

    public void withdraw(double amount) {
        if (amount > total) {
            System.out.println("Insufficient Balance.");
        } else {
            total -= amount;
            System.out.println("Withdrawal Successful. Current Balance: " + total);
        }
    }

    public void deposit(double amount) {
        total += amount;
        System.out.println("Deposit Successful. Current Balance: " + total);
    }
}

class InterestAccount extends Account {
    private double annualInterestRate;

    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public void calculateInterest() {
        double interest = total * annualInterestRate / 100;
        System.out.println("Annual Interest: " + interest);
    }
}

public class BankDetails {

    public static void main(String[] args) {
        InterestAccount account = new InterestAccount();
        account.getDetails();

        // Example values for interest rate and amount
        account.setAnnualInterestRate(5.0);
        double withdrawalAmount = 500;
        double depositAmount = 1000;

        System.out.println("\nBefore Transactions:");
        account.displayBalance();

        System.out.println("\nAfter Withdrawal:");
        account.withdraw(withdrawalAmount);
        System.out.println();

        System.out.println("After Deposit:");
        account.deposit(depositAmount);
        System.out.println();

        System.out.println("After Calculating Annual Interest:");
        account.calculateInterest();
    }
}
Q7) import java.util.Scanner;

// Class representing a Circle
class Circle {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class representing a Square
class Square {
    private double side;

    // Constructor to initialize the side length
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area of the square
    public double calculateArea() {
        return side * side;
    }
}

// Class representing a Rectangle
class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

// Class representing a Cone
class Cone {
    private double radius;
    private double height;

    // Constructor to initialize the radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the area of the cone
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
}

// Class representing a Triangle
class Triangle {
    private double base;
    private double height;

    // Constructor to initialize the base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose a shape
        System.out.println("Select the shape for which you want to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Cone");
        System.out.println("5. Triangle");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        double area = 0.0;

        // Based on user's choice, create object of respective shape class and calculate area
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                area = circle.calculateArea();
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                area = square.calculateArea();
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double rectangleLength = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double rectangleWidth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
                area = rectangle.calculateArea();
                break;
            case 4:
                System.out.print("Enter the radius of the base of the cone: ");
                double coneRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double coneHeight = scanner.nextDouble();
                Cone cone = new Cone(coneRadius, coneHeight);
                area = cone.calculateArea();
                break;
            case 5:
                System.out.print("Enter the base length of the triangle: ");
                double triangleBase = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = scanner.nextDouble();
                Triangle triangle = new Triangle(triangleBase, triangleHeight);
                area = triangle.calculateArea();
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                System.exit(0);
        }

        System.out.println("Area of the selected shape: " + area);

        scanner.close();
    }
}
Q8) interface Library {
    String getBookName();
    String getBookTitle();
    String getAcctype();
    String getDate();
    double getBal();
    String calculateReturnDate();
    double calculateFine();
    void displayDetails();
}

class LibraryImpl implements Library {
    private String bookName;
    private String bookTitle;
    private String acctype;
    private String date;
    private double bal;

    public LibraryImpl(String bookName, String bookTitle, String acctype, String date, double bal) {
        this.bookName = bookName;
        this.bookTitle = bookTitle;
        this.acctype = acctype;
        this.date = date;
        this.bal = bal;
    }

    @Override
    public String getBookName() {
        return bookName;
    }

    @Override
    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public String getAcctype() {
        return acctype;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public double getBal() {
        return bal;
    }

    @Override
    public String calculateReturnDate() {
        // Implement logic for return date calculation
        return "Return Date: ...";
    }

    @Override
    public double calculateFine() {
        // Implement logic for fine calculation
        return 0.0; // Placeholder
    }

    @Override
    public void displayDetails() {
        // Display all details
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Account Type: " + acctype);
        System.out.println("Date: " + date);
        System.out.println("Balance: " + bal);
    }
}

public class LibraryDetails {
    public static void main(String[] args) {
        Library book = new LibraryImpl("Java Programming", "Java Basics", "Regular", "2024-05-21", 20.0);
        book.displayDetails();
        System.out.println("Return Date: " + book.calculateReturnDate());
        System.out.println("Fine Amount: " + book.calculateFine());
    }
}
Q9 public class FibonacciSeries {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
10.
class Student {
    String name;
    int rollNo;
    int age;
    char gender;
    int sub1;
    int sub2;

    public Student(String name, int rollNo, int age, char gender, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.gender = gender;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marks (Subject 1): " + sub1);
        System.out.println("Marks (Subject 2): " + sub2);
    }

    public int calculateTotalMarks() {
        return sub1 + sub2;
    }

    public double calculatePercentage() {
    double totalMarks = sub1 + sub2;
    double maxMarks = 100; // Assuming maximum marks for each subject is 100
    return (totalMarks / (2 * maxMarks)) * 100;
}
    public char calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'D';
        else
            return 'F';
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101, 20, 'M', 85, 90);
        Student student2 = new Student("Alice", 102, 21, 'F', 75, 80);

        student1.displayDetails();
        System.out.println("Total Marks: " + student1.calculateTotalMarks());
        System.out.println("Percentage: " + student1.calculatePercentage());
        System.out.println("Grade: " + student1.calculateGrade());

        System.out.println();

        student2.displayDetails();
        System.out.println("Total Marks: " + student2.calculateTotalMarks());
        System.out.println("Percentage: " + student2.calculatePercentage());
        System.out.println("Grade: " + student2.calculateGrade());
    }
}
Q11)
interface Arithmetic {
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
    public void mod(int a, int b);
}

class Operation implements Arithmetic {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void div(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }

    @Override
    public void mod(int a, int b) {
        if (b != 0)
            System.out.println("Modulus: " + (a % b));
        else
            System.out.println("Cannot perform modulus with zero divisor");
    }
}

public class Calculator {
    public static void main(String[] args) {
        Operation calc = new Operation();
        calc.add(10, 5);
        calc.sub(10, 5);
        calc.mul(10, 5);
        calc.div(10, 5);
        calc.mod(10, 5);
    }
}
Q12
// Define Employee class to represent employee details
class Employee {
    // Private fields to store employee information
    private int empId;
    private String name;
    private double salary;
    private double pf;
    private double hra;

    // Constructor to initialize employee details
    public Employee(int empId, String name, double salary, double pf, double hra) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.pf = pf;
        this.hra = hra;
    }

    // Getter method to retrieve employee ID
    public int getEmpId() {
        return empId;
    }

    // Setter method to set employee ID
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter method to retrieve employee name
    public String getName() {
        return name;
    }

    // Setter method to set employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve employee salary
    public double getSalary() {
        return salary;
    }

    // Setter method to set employee salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method to retrieve employee PF (Provident Fund)
    public double getPf() {
        return pf;
    }

    // Setter method to set employee PF (Provident Fund)
    public void setPf(double pf) {
        this.pf = pf;
    }

    // Getter method to retrieve employee HRA (House Rent Allowance)
    public double getHra() {
        return hra;
    }

    // Setter method to set employee HRA (House Rent Allowance)
    public void setHra(double hra) {
        this.hra = hra;
    }

    // Method to calculate total salary (Salary + HRA - PF)
    public double calculateTotalSalary() {
        return salary + hra - pf;
    }
}

// Main class to demonstrate Employee details and encapsulation
public class EmployeeDetails {
    public static void main(String[] args) {
        // Create Employee objects and initialize them with details
        Employee emp1 = new Employee(101, "John Doe", 50000, 5000, 10000);
        Employee emp2 = new Employee(102, "Alice Smith", 60000, 6000, 12000);

        // Display details of Employee 1
        System.out.println("Employee 1 Details:");
        System.out.println("ID: " + emp1.getEmpId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: $" + emp1.getSalary());
        System.out.println("Total Salary: $" + emp1.calculateTotalSalary());

        // Display details of Employee 2
        System.out.println("\nEmployee 2 Details:");
        System.out.println("ID: " + emp2.getEmpId());
        System.out.println("Name: " + emp2.getName());
        System.out.println("Salary: $" + emp2.getSalary());
        System.out.println("Total Salary: $" + emp2.calculateTotalSalary());
    }
}
Q13
class Stack {
    private int[] array;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a maximum size
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        top = -1; // Initialize top pointer to -1 (empty stack)
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (top < maxSize - 1) {
            array[++top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack Overflow! Cannot push element " + element);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top >= 0) {
            int poppedElement = array[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack Underflow! Cannot pop element.");
            return -1; // Returning -1 indicates an empty stack or underflow condition
        }
    }

    // Method to display the elements of the stack
    public void display() {
        if (top >= 0) {
            System.out.println("Elements in the stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("Stack is empty!");
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack(10); // Create a stack with a maximum size of 10

        // Perform stack operations
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.display(); // Display stack elements
        stack.pop();
        stack.display(); // Display stack elements after pop operation
        stack.pop();
        stack.pop(); // Perform additional pop operations
        stack.display(); // Display stack elements after additional pops
    }
}
Q14)
import java.util.Scanner;

class Calculator {
    // Method to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Cannot divide by zero.");
            return Double.NaN; // Returning NaN (Not a Number) indicates an error
        }
        return num1 / num2;
    }

    // Method to perform modulus
    public static double modulus(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Cannot perform modulus with zero divisor.");
            return Double.NaN; // Returning NaN (Not a Number) indicates an error
        }
        return num1 % num2;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = Calculator.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = Calculator.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = Calculator.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = Calculator.divide(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 5:
                result = Calculator.modulus(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
Q15)
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // 1. Length Method
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // 2. charAt Method
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);
        
        // 3. substring Method
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // 4. indexOf Method
        int indexOfW = str.indexOf('W');
        System.out.println("Index of 'W': " + indexOfW);
        
        // 5. toUpperCase Method
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);
        
        // 6. toLowerCase Method
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);
    }
}
In Java, the `this` keyword is used to refer to the current instance of a class. It has several important uses:

1. **To Refer to Instance Variables**: When there is ambiguity between instance variables and parameters with the same name, the `this` keyword can be used to refer to the instance variables of the current object.

    ```java
    public class MyClass {
        private int x;

        public void setX(int x) {
            this.x = x; // 'this' refers to the instance variable x
        }
    }
    ```

2. **To Invoke Current Class Method**: If a method calls another method within the same class, `this` can be used to call the method without ambiguity.

    ```java
    public class MyClass {
        public void method1() {
            System.out.println("Inside method1");
            this.method2(); // Call method2() of the current object
        }

        public void method2() {
            System.out.println("Inside method2");
        }
    }
    ```

3. **To Invoke Current Class Constructor**: Similar to invoking methods, `this` can be used to call a constructor from another constructor within the same class.

    ```java
    public class MyClass {
        private int x;

        public MyClass() {
            this(0); // Calls the parameterized constructor
        }

        public MyClass(int x) {
            this.x = x;
        }
    }
    ```

4. **To Return Current Object**: In method chaining or returning the current object from a method, `this` can be used.

    ```java
    public class MyClass {
        private int x;

        public MyClass setX(int x) {
            this.x = x;
            return this; // Returns the current object
        }
    }
    ```

Overall, the `this` keyword is essential in Java for disambiguating between instance variables and parameters, invoking current class methods and constructors, and returning the current object from methods. It helps in writing clear and readable code.
Q19)
interface InterestCalculator {
    double calculateSimpleInterest(double principal, double rate, double time);
}

class SimpleInterest implements InterestCalculator {
    @Override
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

public class InterestCalculatorApp {
    public static void main(String[] args) {
        InterestCalculator calculator = new SimpleInterest();
        
        // Example usage
        double principal = 1000;
        double rate = 5; // 5%
        double time = 2; // 2 years
        
        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
20. class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class AdvancedArithmetic extends Arithmetic {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}

public class ArithmeticOperations {
    public static void main(String[] args) {
        AdvancedArithmetic calculator = new AdvancedArithmetic();

        // Example usage
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
Q25) 
class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Square(5),
            new Rectangle(4, 6),
            new Triangle(3, 4),
            new Circle(2)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
Q26)
class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape triangle = new Triangle(3, 4);

        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
Q27) 
class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        // Default implementation returns 0 interest
        return 0;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }
}

class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int duration; // in years

    public FixedDepositAccount(double balance, double interestRate, int duration) {
        super(balance);
        this.interestRate = interestRate;
        this.duration = duration;
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100) * duration;
    }
}

public class BankInterestCalculator {
    public static void main(String[] args) {
        // Create savings account with balance $1000 and interest rate 5%
        BankAccount savingsAccount = new SavingsAccount(1000, 5);
        double savingsInterest = savingsAccount.calculateInterest();
        System.out.println("Savings Account Interest: $" + savingsInterest);

        // Create fixed deposit account with balance $2000, interest rate 6%, and duration 2 years
        BankAccount fixedDepositAccount = new FixedDepositAccount(2000, 6, 2);
        double fixedDepositInterest = fixedDepositAccount.calculateInterest();
        System.out.println("Fixed Deposit Account Interest: $" + fixedDepositInterest);
    }
}
Q26)
Run-time polymorphism is a feature of object-oriented programming languages like Java, where a subclass can provide a specific implementation of a method that is already defined in its superclass. This allows a single method name to perform different actions based on the type of object that is calling it at runtime.
The key components of run-time polymorphism are inheritance, method overriding, and dynamic method dispatch:
•	Inheritance: Subclasses inherit properties and behaviors from their superclass.
•	Method Overriding: Subclasses can provide a specific implementation of a method that is already defined in their superclass.
•	Dynamic Method Dispatch: The JVM determines which version of the overridden method to execute based on the actual type of the object at runtime.
class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape triangle = new Triangle(3, 4);

        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

