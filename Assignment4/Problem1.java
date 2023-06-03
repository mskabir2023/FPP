//Write a method to display the digits of a given integer value n in reverse order.
public class Problem1 {

    static int reverNum = 0;
    static int baseM = 1;

    static int reverse(int num) {

        if (num > 0) {

            reverse(num / 10);
            reverNum += (num % 10) * baseM;
            baseM *= 10;
        }
        return reverNum;
    }

    public static void main(String[] args) {

        System.out.println(reverse(12345));

    }

}