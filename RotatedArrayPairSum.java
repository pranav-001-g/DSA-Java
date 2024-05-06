import java.util.ArrayList;
public class RotatedArrayPairSum {

    public static void main(String arg[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int flag=0;
        int n=13;
        int left=0;
        int right=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                right=i;
                left=i+1;
                break;
            }
        }
        System.out.println(list);
    while(left!=right){
        int cur=list.get(left)+list.get(right);  

        if(cur==n){
            System.out.println("The index are "+left+" and "+right);
            flag=1;
            break;
        }
        else if(cur<n){
            left=(left+1)%list.size();
            
        }
        else{
            right=(n+right-1)%list.size();
        }

    }
    if(flag==0){
        System.out.println("No two element sum is = "+n);

    }
    
}
}