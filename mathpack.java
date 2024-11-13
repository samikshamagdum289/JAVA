package math;

public class mathpack {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double cube(double x) {
        return x * x * x;
    }
}