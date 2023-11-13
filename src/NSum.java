public class NSum {
    public int execute(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + execute(n / 10);
    }
}
