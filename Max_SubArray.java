import java.util.*;
public class Max_SubArray {
   static void subArray(int array[]){
   
    int a=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+",");
                   sum=sum+array[k];
                }
    
                System.out.print(" ="+sum);
                System.out.println();
               
                
               if(a<sum){
                a=sum;
               }
            }
            System.out.println();
            
        }
        System.out.println("------------------------------------------------");
        System.out.println("Maximum sum of sub array is ="+a);
        System.out.println("------------------------------------------------");
    }
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=obj.nextInt();
        System.out.println("Enter the elements in the array :");
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        System.out.println("------------------------------------------------");
        subArray(array);
        obj.close();
    }
}
