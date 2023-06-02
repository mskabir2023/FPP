/*Create a class Prog5 and implement the given method which takes the two arrays of inputs and combine the two arrays into single array.
public int[] combine(int[] a, int[] b); Example: Input array a : [5,6,-4,3,1] Input array b: [ 3,8,9,11] Output arrays: [ 5,6,-4,3,1, 3,8,9,11]
*/
import java.util.Arrays;
public class Prog5 {public static void main(String[] args)
{
    int[] a= new int[] {5,6,-4,3,1};
    int[] b= new int[] {3,8,9,11};
    int[] output= combine(a,b);
    System.out.println("The output array is : "+Arrays.toString(output));
}
static int[] combine(int[] x, int[] y)
    {
        int[] combine = new int[x.length+y.length];
        int count=0;
        int i=0;
        while(i< x.length)
        {
            combine[count]=x[i];
            count++;
            i++;
        }
        int j=0;
        while(j<y.length)
        {
            combine[count]=y[j];
            count++;
            j++;
        }
        return combine;

    }
}
