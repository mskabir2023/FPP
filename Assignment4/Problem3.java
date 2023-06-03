//Write a method to compute the sum of all elements of the array arr, of size n.
public class Problem3 {

    static int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return  arr[n - 1]+ sum(arr, n - 1) ;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2};

        System.out.println(sum(arr, arr.length));
    }
}