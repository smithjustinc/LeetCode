/*
 * You are given two integers n and t. Return the smallest number
 * greater than or equal to n such that the product of its digits is divisible by t.
 */

public class SmallestDivisibleDigitProduct1 {
    public int getDigitProduct(int num) {
        int product = 1;
        while (num > 0) {
            product  = product * (num%10);
            num /= 10;
        }
        return product;
    }

    public int smallestNumber(int n, int t){
        while (n <=100) {
            int product = getDigitProduct(n);
            if (product % t == 0) return n;
            n++;
        }
        return 0;
    }
    public static void main(String[] args) {
        SmallestDivisibleDigitProduct1 x = new SmallestDivisibleDigitProduct1();
        System.out.println(x.smallestNumber(15, 3));
    }
}
