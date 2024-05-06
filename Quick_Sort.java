public class Quick_Sort {

    static void sort(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int pindex=partition(arr,si,ei);
        sort(arr,si,pindex-1);
        sort(arr, pindex+1, ei);

    }
    static int partition(int arr[],int si,int ei){
        int temp;
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
            
        }
        i++;
       
       arr[ei]=arr[i];
       arr[i]=pivot;

       return i;

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int arr[]={4,3,5,2,1};
        print(arr);
        sort(arr,0,arr.length-1);
        print(arr);
    }
    
}
