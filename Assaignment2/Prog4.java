/*Create a class Prog4. Inside its main method, create float variables to store each of the following
numbers:1.27, 3.881, 9.6 Output to the console the following two values: 1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the Math.round function*/
public class Prog4 {
    public static void main(String[] args) {
        float a=1.27f,b=3.881f,c=9.6f;
        int sum=(int)(a+b+c);
        System.out.println("sum="+sum);
        int sum1=(int)Math.round(a+b+c);
        System.out.println("sum1="+sum1);



    }
}
