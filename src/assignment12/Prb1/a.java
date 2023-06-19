package assignment12.Prb1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        int inp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  input number: ");
        try {
            inp = sc.nextInt();
            if (inp < 0 || inp > 100) throw new UnsupportedOperationException("Enter Should be 0 to 100.");
        } catch (InputMismatchException e) {
            System.out.println("Enter Should be an integer Number!");
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Test Finally");
        }
    }
}
