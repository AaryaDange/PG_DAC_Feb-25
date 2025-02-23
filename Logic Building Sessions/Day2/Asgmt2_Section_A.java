Snippet 1:  
public class Main { 
    public void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
 What error do you get when running this code?

ans:-  Main method is not static in class Main.

Snippet 2:  
public class Main { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
 What happens when you compile and run this code?

ans :- error : Main method not found in class Main, please define the main method as:
   public static void main(String[] args)


Snippet 3:  
public class Main { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    } 
} 
 What error do you encounter? Why is void used in the main method? 
ans :-error: Main method must return a value of type void in class Main.
void is used to specify that a method doesn’t return anything. As the main() method doesn’t return anything, its return type is void. 

Snippet 4:  
public class Main { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
} 
 What happens when you compile and run this code? Why is String[] args needed?

ans:-  error: Main method not found in class Main.
When we run a Java program we can pass some input to program.Those inputs are stored in this String args array.


Snippet 5:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 
 Can you have multiple main methods? What do you observe? 

ans :- yes we can have more than one main method.but it will only call the method with proper/Standard syntax i.e.1st main method in above snippet.


Snippet 6:  
public class Main { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
} 
 What error occurs? Why must variables be declared?

ans :- error: cannot find symbol
Variables must be declared because it informs the compiler about the variable's name, data type, and memory allocation needed.

Snippet 7:  
public class Main { 
    public static void main(String[] args) { 
        int x = "Hello"; 
        System.out.println(x); 
    } 
} 
 What compilation error do you see? Why does Java enforce type safety? 
ans:-  error: incompatible types: String cannot be converted to int.
Java enforce type safety to prevent arbitrary access to memory.


Snippet 8:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!" 
    } 
} 
 What syntax errors are present? How do they affect compilation? 

ans:- error: ')' expected.
your code will not compile successfully.


Snippet 9:  
public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
} 
 What error occurs? Why can't reserved keywords be used as identifiers?
ans:-  error: <identifier> expected
       error: not a statement
because they have a predefined meaning within the language itself so we cannot use them as identifiers.


Snippet 10:  
public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 
 What happens when you compile and run this code? Is method overloading allowed? 
ans:-  error: non-static method display() cannot be referenced from a static context.
Method overloading is allowed in java.but, static methods cannot directly access non-static methods or fields without creating an instance of the class.so error occured.


Snippet 11:  
public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
} 
 What runtime exception do you encounter? Why does it occur?
ans:- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3.
occurs because we're trying to access an index that does not exist within the array.

Snippet 12:  
public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
} 
 What happens when you run this code? How can you avoid infinite loops?
ans- it will go into infinite loop situation we can avoid this simply by providing loop terminating condition.


Snippet 13:  
public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
 What exception is thrown? Why does it occur? 
ans:- Exception in thread "main" java.lang.NullPointerException. because str is not pointing towards anything in memory. it cannot access the memory location. 


Snippet 14:  
public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 
 What compilation error occurs? Why does Java enforce data type constraints? 
ans: error:incompatible types: String cannot be converted to double
Java enforce type safety to prevent arbitrary access to memory.


Snippet 15:  
public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 
 What error occurs when compiling this code? How should you handle different data types in operations?

ans: error: incompatible types: possible lossy conversion from double to int.
we can handle this by using typecasting of int to double.


Snippet 16:  
public class Main { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
    } 
} 
 What is the result of this operation? Is the output what you expected? 
ans:- result is 2.0.
No I wasn't expecting this.I have expected something like 2.5 because 10 / 4 is actually 2.5 but as num is in int format it is first doing division and then that result int is converting into double type.


Snippet 17:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 
 What compilation error occurs? Why is the ** operator not valid in Java? 

ans:- error: illegal start of expression
Because ** operator doesn't exist in Java.

Snippet 18:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} 
 What is the output of this code? How does operator precedence affect the result?
ans:- 20
according to Rule it will first do multiplication followed by addition.


Snippet 19:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 
 What runtime exception is thrown? Why does division by zero cause an issue in Java?

ans: Exception in thread "main" java.lang.ArithmeticException: / by zero
as java cannot handle undefined/infinite results so it raises error.

Snippet 20:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World") 
    } 
} 
 What syntax error occurs? How does the missing semicolon affect compilation? 

ans:-  error: ';' expected
 Without semicolon the compiler cannot determine where the first statement ends and where the next statement begins.
 
Snippet 21:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
} 
 What does the compiler say about mismatched braces? 

ans:- throws error: reached end of file while parsing
 
Snippet 22:  
public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 
 What syntax error occurs? Can a method be declared inside another method?
ans:- error: illegal start of expression
      error: class, interface, or enum expected
No, methods cannot be declared inside another method. we can declare the method outside the main method .
 
Snippet 23:  
public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 
 Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent the program from executing the default case? 
 
ans:- In Switch case statement we have to give break statement in every case. If there is no break statement will be given then it will go to the next case and also execute it.To avoid such situation in above code snippet, we have to write break statement at end of every case. 
 
 
Snippet 24:  
public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 
 
ans:-When level = 1, the program matches case 1: and executes System.out.println("Level 1").same with level =2,3 and default case.
Without the break statement, the execution continues with all the next cases until all cases ends.


Snippet 25:  
public class Switch { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the types allowed in switch expressions? How can you modify the code to make it work? 

ans:-error:incompatible types: possible lossy conversion from double to int
This error occurs because the switch statement in Java does not support using floating-point types like double or float.
 To make the code work:we can change the variable type from double to int

Snippet 26:  
public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 
 Error to Investigate: Why does the compiler complain about duplicate case labels? What happens when you have two identical case labels in the same switch block? 

ans:- Duplicate case labels(keys) are not allowed in a switch statement.
This causes an ambiguous situation for the compiler about which block of code should be executed, so it throws an error. 

















