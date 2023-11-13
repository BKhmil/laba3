public class Fibonacci {
    public int recursionExecute(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return recursionExecute(n - 1) + recursionExecute(n - 2);
        }
    }

    public int cycleExecute(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        int a = 0, b = 1, result = 0;
        for (int i = 3; i <= n; ++i) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
