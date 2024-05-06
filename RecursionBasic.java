public class RecursionBasic 
{

        static void printDec(int n)
        {
            if(n==1)
            {
                System.out.println(n+" ");
                  return;
            }
            System.out.print(n+" ");

            printDec(n-1);
        }
//---------------------------------------------------------------------------------------------------
        static void printInc(int n)
        {
            if(n==1){
                System.out.print(n+" ");
                return;
            }

            printInc(n-1);
            System.out.print(n+" ");
        }
//---------------------------------------------------------------------------------------------------
            static int fact(int n)
            {
                if(n==1)
                {
                    return n;
                }
                return n*fact(n-1);
  
            }
//---------------------------------------------------------------------------------------------------
            static int fibonacci(int n)
            {
                 if(n==0||n==1){
                      return n;
                    }
                    int fib1=fibonacci(n-1);
                    int fib2=fibonacci(n-2);
                   
                    return fib1 + fib2;
            }
//---------------------------------------------------------------------------------------------------
            public static boolean isSort(int array[],int i)
            {
                    if(i==array.length-1){
                        return true;
                    }
                    if(array[i]>array[i+1]){
                        return false;
                    }
                    else{
                        return isSort(array, i+1);
                    }

            }
//---------------------------------------------------------------------------------------------------
            public static int power(int a,int n){
                if(n==1){
                    return a;
                }
                System.out.print(a*power(a,n-1)+" ");
                return 1;
                
            }
//---------------------------------------------------------------------------------------------------
            public static int optimalPower(int a,int n){
                if(n==0){
                    return 1;
                }
                
               int  snum =optimalPower(a, n/2)*optimalPower(a, n/2);
                if(n%2 !=0){
                    snum=a*snum;
                }

                return snum;
            }
//---------------------------------------------------------------------------------------------------
            public static void duplicitesInString(int i ,String s,StringBuilder sb,boolean array[]){
                // boolean array[ ]=new boolean[26];
                if(i==s.length()){
                    System.out.println(sb);
                    return ;
                }
                
                int c=s.charAt(i);
               if(array[c-'a']==true){
                    duplicitesInString(i+1, s, sb,array );
                    
                }
                else{
                    array[c-'a']=true;
                    sb.append(s.charAt(i));
                    duplicitesInString(i+1, s, sb, array);
                }
            
            }
public static void main(String[] args) 
    {
        // printDec(10);

        // printInc(10);

        //System.out.println(fact(5));

        // System.out.println(fibonacci(5));

        /*
        int array[]={1,2,3,4,5,6};
        System.out.println(isSort(array,0));
        */

        // System.out.print(power(2, 5));

        // System.out.println(optimalPower(2, 10));

        duplicitesInString(0, "pprraannav", new StringBuilder(),new boolean[26]);
        
    }
}