import java.util.*;
public class Linner_Search {
    int search(int key,int array[]){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=obj.nextInt();
        int array[]=new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0;i<n;i++){

             array[i]=obj.nextInt();
        }
        System.out.println("Enter the key value to search :");
        int key=obj.nextInt();
        Linner_Search ob =new Linner_Search();
        int index=ob.search(key, array);
        if(index==-1){
            System.out.print("The key value you enter does not exist in array :");

        }
        else{
            System.out.println("The key value you enter exist at "+(index+1)+" position ");
        }


        obj.close();
    }
}
