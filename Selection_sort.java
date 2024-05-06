
public class Selection_sort {
    public static void sorted(int array[]){
        for(int i=0;i<array.length-1;i++){
            int small=i;
            for(int j=i+1;j<array.length;j++){
                if(array[small]>array[j]){
                    small=j;
                }
               
                
            }
            int temp=array[small];
            array[small]=array[i];
            array[i]=temp;
        }
    }
    public static void main(String[] args) {
        int array[]={2,30,5,6,66,23,50};
        System.out.println("Array before sorting :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
         System.out.println("\n============================= After Sorting =======================");
         sorted(array);
         System.out.println("Array after sorting :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
    }
}

