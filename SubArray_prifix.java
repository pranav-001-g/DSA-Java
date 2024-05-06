import java.util.*;
public class SubArray_prifix{
    public static void SubArraySum(int number[])
    {
        int maxsum=Integer.MIN_VALUE;
       for(int i=0;i<number.length;i++)
       {
            int tempsum=0;
            for(int j=i;j<number.length;j++){
                tempsum=number[j]+tempsum;
                maxsum=Math.max(tempsum, maxsum);
            }
       }
        
        System.out.println("-------------------------------------------------------");
        System.out.println("The maximum sum of sub array is ="+maxsum);
        System.out.println("-------------------------------------------------------");
    }
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the the Size of array ");
        int n=obj.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for(int i=0;i<n;i++)
        {
            array[i]=obj.nextInt();
        }
        SubArraySum(array);
        obj.close();
        }
    }