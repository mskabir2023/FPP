//Write a method to count the number of digits in an integer value n. Assume that n is
//nonnegative and represented in base ten.
public class Problem2 {
    static int count = 0;

    static int reverseDigits(int num) {
        if (num > 0) {
            reverseDigits(num / 10);

            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(1234567));
    }
}
