public class Main {
    public static void main(String[] args) {
        // запуск з терміналу для копіпаста D:\forjdk\bin\java.exe -ea -cp D:\forJava\laba3\out\production\laba3 Main

        // ---------------------- ФАКТОРІАЛ
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();

        int n = 6;
        int recursionFactorialResult = factorial.recursionExecute(n);
        int cycleFactorialResult = factorial.cycleExecute(n);
        assert recursionFactorialResult == cycleFactorialResult : "ERROR in factorial results";

        System.out.println("Factorial of " + n + ": " + recursionFactorialResult);

        // ---------------------- ФІБОНАЧЧІ
        int recursionFibonacciResult = fibonacci.recursionExecute(n);
        int cycleFibonacciResult = fibonacci.cycleExecute(n);
        assert recursionFibonacciResult == cycleFibonacciResult : "ERROR in fibonacci number results";

        System.out.println("Fibonacci number at position " + n + ": " + recursionFibonacciResult);

        // ---------------------- СУМА ЦИФР ЧИСЛА  +  СУМА ДВОХ ЧИСЕЛ БЕЗ +
        NSum nsum = new NSum();
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();

        int number = 1234;
        int sumOfDigits = nsum.execute(number);
        int recursiveSum = sumOfTwoNumbers.execute(5, 10);

        System.out.println("Sum of digits in " + number + ": " + sumOfDigits);
        System.out.println("Recursive sum of 5 and 10: " + recursiveSum);
    }
}