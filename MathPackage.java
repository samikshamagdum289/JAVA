package math;

public class MathPackage {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static double cube(double num) {
        return num * num * num;
    }
}