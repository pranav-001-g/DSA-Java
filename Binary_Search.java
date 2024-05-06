import java.util.*;
public class Binary_Search {
   int search (int array[],int key){
        int start =0;
        int end=array.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(array[mid]==key){
                return mid;
            }
            else if(key<mid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=obj.nextInt();
        System.out.println("Enter the elements in the array ");
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        System.out.println("Enter the key value to search with binary search ");
        int key=obj.nextInt();
        Binary_Search binary =new Binary_Search();
        int index=binary.search(array,key);
        if(index==-1){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("The element is in the array and it is at "+(index+1)+" position.");
        }
        obj.close();
    }
}
