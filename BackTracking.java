import java.util.*;
public class BackTracking {
    //--------------------------------------------------------------------------------------------------------------
        static void substring(String name,String ans,int i)
        {
            if(i==name.length()){
                if(ans.length()==0){
                    System.out.println("NULL");
                    return;
                }
               else{
                System.out.println(ans);
                return;
               }
            }
            substring(name, ans+name.charAt(i), i+1);
            substring(name, ans, i+1);
        }
    //--------------------------------------------------------------------------------------------------------------
        static void stringPermutation(String name,String ans){
            if(name.length()==0){
                System.out.println(ans);
                return;
            }
            for(int i=0;i<name.length();i++){
                char c=name.charAt(i);
                String newname =name.substring(0,i)+name.substring(i+1);
                stringPermutation(newname, ans+c);
            }
        }
    //--------------------------------------------------------------------------------------------------------------
       static void stringPermutation1(String name){
        StringBuilder sb = new StringBuilder(name);
        for(int i=0;i<name.length();i++){
            for(int j=1;j<name.length();j++){
                char c=sb.charAt(j-1);
                sb.setCharAt(j-1,sb.charAt(j));
                sb.setCharAt(j, c);
                System.out.println(sb);
            }
        }
       }
    //--------------------------------------------------------------------------------------------------------------
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        // substring("pranav","",0);
        stringPermutation("abc","");
        // stringPermutation1("abc");


        obj.close();
    }
}