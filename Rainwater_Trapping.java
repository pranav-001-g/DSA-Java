import java.util.*;

public class Rainwater_Trapping {
    public static int tapping(int number[]){
       int n=number.length;
        int left[]=new int[n];
        left[0]=number[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],number[i]);
        }
        int right[]=new int[n]; 
        right[n-1]=number[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],number[i]);
        }
        int Trap_water=0;
        for(int i=0;i<n;i++){
           
           int waterlevel=Math.min(left[i],right[i]);
             Trap_water += waterlevel-number[i];
        }
        return Trap_water;
    }
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=obj.nextInt();
        int number[]=new int[n];
        System.out.print("Enter the value of graphs ");
        for(int i=0;i<n;i++){
            number[i]=obj.nextInt();
        }
        System.out.println("Water stored in is = "+tapping(number));
        obj.close();
    }
}
