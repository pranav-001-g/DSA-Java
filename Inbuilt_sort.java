import java.util.*;
public class Inbuilt_sort{
    public static void main(String arg[]){
         
        int array[]={5,4,3,2,1};

         System.out.println("Array before sorthing ");
         for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
         }

         System.out.println("\nArray after sorting ");
         Arrays.sort(array);
         for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
         }


         System.out.println("\n\nprinting sorted array up to index 2 i.e to number 3 :");
         int array1[]={5,4,3,2,1};
          System.out.println("Array before sorthing ");
         for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
         }
         Arrays.sort(array1 ,0,3);
         System.out.println("\nArray after sorting into length");
         for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
         }

        System.out.println("\n\nPrinting the array in revers order /nfor printing the array in revers order we shold use the Integer obj insted of int data type ");
         
        Integer array2[]={1,2,3,4,5};
        System.out.println("Array before sorthing ");
        for(int i=0;i<array2.length;i++){
           System.out.print(array2[i]+" ");
        }
        System.out.println("\nArray after sorting ");
        Arrays.sort(array2,Collections.reverseOrder());
        for(int i=0;i<array2.length;i++){
           System.out.print(array2[i]+" ");
        }



    }
}