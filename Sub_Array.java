import java.util.*;
public class Sub_Array {
   static void subArray(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
               
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+",");
                }
               
                System.out.print("  ");


            }
            System.out.println();
        }
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
        subArray(array);
        obj.close();
    }
}
