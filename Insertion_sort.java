public class Insertion_sort{
    public static void main(String arg[]){
        int array[]={5,4,3,2,1};
        System.out.println("Array before printing ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        for(int i=1;i<array.length;i++){
            int cur=array[i];
            int pre=i-1;

            while(pre>=0 && array[pre]>cur){
                array[pre+1]=array[pre];
                pre--;
            }
            pre++;
            array[pre]=cur;
        }
        System.out.println("\nArray after printing ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}