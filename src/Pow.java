public class Pow {
    static Long N = 10000000L;
    private static double Exponent(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x % N;
        double solution = Exponent(x, n / 2);
        solution = (solution * solution) % N;
        if (n % 2 == 0) {
            return solution;
        }else {
            return ((x%N) * solution)%N;
        }
    }

    public static double myPower(double x, int n) {
        if (n < 0) return 1 / (Exponent(x, n));
        return Exponent(x, n);
    }
    public static void main(String[] args) {
        System.out.println(myPower(2, -2));
    }
}
