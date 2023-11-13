public class SumOfTwoNumbers {
    public int execute(int a, int b) {
        if (b == 0) {
            return a;
        }
        return execute(a ^ b, (a & b) << 1);
    }
}
