public class Factorial {
    public int recursionExecute(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursionExecute(n - 1);
    }

    public int cycleExecute(int n) {
        int result = 1;
        for (int i = 1; i <= n; ++i) {
            result *= i;
        }
        return result;
    }
}
