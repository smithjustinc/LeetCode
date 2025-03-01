/*
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

public class AddDigits {
    private int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while (num > 9) {
            num = getDigitSum(num);
        }
        return num;
    }
    public static void main(String[] args) {
        AddDigits x = new AddDigits();
        System.out.println(x.addDigits(22));
    }
}
