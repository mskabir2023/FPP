/*Write a program called RemoveDups. Create an array which accepts an array of Strings only. Creates a new array in which all duplicate Strings in the original input array have been
removed. You should not use any APIs like HashSet, TreeSet etc., Write your own logic. Also, your result should not contain null values.
For example, if the input array is ["horse", "dog", "cat", "horse", dog"] then the output would be the following array:
["horse","dog","cat"]*/
import java.util.Arrays;
public class RemoveDups {
    public static void main(String[] args)
    {
        String[] ia= new String[]{"horse","dog","cat","horse","dog","cow"};
        String[] output =remdups(ia);
        System.out.println("The Input array Is : "+ Arrays.asList(ia));
        System.out.println("After removing the duplicate string,the output  array Is : "+Arrays.asList(output));
    }
    public static String[] remdups(String[] inputArray)
    {
        StringBuilder arraynew= new StringBuilder();
        String receivestring="";
        int k=0;
        while(k< inputArray.length)
        {
            int j=0;
            receivestring=inputArray[k];
            while(j<=k)
            {
                if(receivestring==inputArray[j])
                {
                    break;
                }
                j++;
            }
            if(k==j)
            {
                arraynew.append(inputArray[k]);
                arraynew.append(",");
            }
            k++;
        }
        String[] remdups=arraynew.toString().split(",");
        return remdups;
    }
}
