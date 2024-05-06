public class Bubble_Sort{
        public static void sorted(int array[]){
            int n=array.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(array[j]>array[j+1]){
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }

        }
        public static void main(String[] args) {
        int array[]={2,30,5,6,66,23,50};
        System.out.println("Array before sorting :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
         System.out.println("\n=======================================================");
         sorted(array);
         System.out.println("Array after sorting :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
    }
}