import java.util.*;
public class ContainerWithMostWater{

    static int store(ArrayList<Integer> hight){
        int left=0;
        int right=hight.size()-1;
        int maxwater=0;
        while (left<right) {
            int width=right-left;
            int current=width*Math.min(hight.get(left),hight.get(right));
            maxwater=Math.max(current,maxwater);
            if(left<right){
                left++;
            }
            else{
                right++;
            }
        }

        return maxwater;
    }
    public static void main(String arg[]){
        ArrayList<Integer> hight=new ArrayList<>();
        Scanner obj=new Scanner(System.in);
        int n=9;
        System.out.println("Enter the value of Container Bondries : ");
        for(int i =0;i<n;i++){
            hight.add(obj.nextInt());
        } 
        System.out.println("Maximum water store in the container is = "+store(hight));


        obj.close();

    }
}