import java.util.*;
public class UglinessString {
    
    public static void ugly(String s,int flip,int swap,int cost)
    {
        int i=0;
        StringBuffer sb=new StringBuffer(s);
      while(cost>=flip)
      {
            if(sb.charAt(i)==1){
              sb.setCharAt(i, '0'); 
              cost-=flip; 
            }
            
                i++;
            
      }
      int j=s.length()-1;
      while(cost>=swap && i<j){
            if(sb.charAt(j)==0)
            {
                if(sb.charAt(i)==1)
                {
              sb.setCharAt(i, '0');
              sb.setCharAt(j, '1'); 
              cost-=swap;
                }
                
                    i++;
                
            }
            
                j--;
            
      }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the binary string :");
        String s= obj.next();
        System.out.println("Enter the total cost ");
        int cost=obj.nextInt();
        System.out.println("Enter the swap cost ");
        int swap=obj.nextInt();
        System.out.println("Enter the flip cost ");
        int flip=obj.nextInt();
        ugly(s, flip, swap, cost);

        obj.close();
    }
}