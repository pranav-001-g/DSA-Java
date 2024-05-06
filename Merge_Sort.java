public class Merge_Sort {

        public static void sort(int arr[],int si,int ei)
        {
            if(si>=ei){
                return;
            }

           int mid=si+(ei-si)/2;
           sort(arr,si,mid);
           sort(arr,mid+1,ei);

           merge(arr,si,mid,ei);
        }

        public static void merge(int arr[],int si,int mid,int ei){
            int i=si;
            int j=mid+1;
            int p=0;
            int temp[]=new int[ei-si+1];
            while (i<=mid && j<=ei) {
                if(arr[i]<arr[j]){
                     temp[p]=arr[i];
                    i++;
                }
                else{
                    temp[p]=arr[j];
                    j++;
                }
                p++;
            }

            while(i<=mid){
                temp[p]=arr[i];
                i++;
                p++;
            }
            while(j<=ei){
                temp[p]=arr[j];
                j++;
                p++;
            }

            for(i=si,p=0;p<temp.length;i++,p++){
                arr[i]=temp[p];
            }
        }

        public static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        
        public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        print(arr);
        sort(arr,0,arr.length-1);
        print(arr);
        


    }
}