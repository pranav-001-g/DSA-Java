public class Counting_Sort {
    public static void main(String arg[])
    {
        int array[]={1,4,1,3,2,4,3,7,7};

        int largest=Integer.MIN_VALUE;
        
        for(int i=0;i<array.length;i++)
        {
            largest=Math.max(largest,array[i]);
        }

       int count[]=new int[largest+1];
        
       for(int i=0;i<array.length;i++){
        count[array[i]]++;
        
       }
       // arrengment in java
       for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
       }
       int output[]=new int[array.length];

       for(int i=0;i<array.length;i++){
         output[count[array[i]]-1]=array[i];
         count[array[i]]--;
       }
       System.out.println("Array before sorting ");
       for(int i=0;i<array.length;i++)
    {
            System.out.print(array[i]+" ");
    }
    System.out.println("\nArray after sorting");
    for(int i=0;i<array.length;i++)
 {
         System.out.print(output[i]+" ");
 }
        
    }
    
}
