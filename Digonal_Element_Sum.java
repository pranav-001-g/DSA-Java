import java.util.*;
public class Digonal_Element_Sum 
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=obj.nextInt();

        int sum1=0; 
        int sum2=0; 

        int array[][]=new int[n][n];
        System.out.println("Enter "+(n*n)+" elements in the array ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=obj.nextInt();
            }
        }
        /*
         if we take the the matrix of 4 by 4 type i.e even type
            1  2  3  4
            5  6  7  8
            9 10 11 12
           13 14 15 16
           
           there is no comman element in the pd and sd

           so sum of digonal element is =(primary digonal)+(Secondary digonal) ;
           i.e sum of digonal element is = (1+6+11+16)+(4+7+10+13) ;
           ====================================================================================
           
           if we take the matrix of 3 by 3 i.e odd type
           1 2 3
           4 5 6
           7 8 9
           
           there is comman element in the pd and sd i.e is 5;
           
           so sum of digonal element is =(primary digonal)+(Secondary digonal)-comman element ;
           i.e sum of digonal element is =(1+5+9)+(3+5+7)-3;
           =====================================================================================
           if we want to make one code for both odd and even matrix type we should avoid to calculte pd and sd
           separatly
         */
    System.out.println("Simple way to print the sum of digonal elements is ");    
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++){
            //condition for pd ;
            if(i==j){
                System.out.print(array[i][j]+" ");
                sum1=sum1+array[i][j];
            }
            //condition for sd;
           else if((i+j)==(n-1)){
                System.out.print(array[i][j]+" ");
                sum1=sum1+array[i][j];
            }
        }

    }
    System.out.println("\nThe sum of digonal matrix element is = "+sum1);
    

    System.out.println("=====================================================================================");
    System.out.println("\n2nd way to avoid one for loop ");
    for(int i=0;i<n;i++)
{
        System.out.print(array[i][i]+" ");
        sum2=sum2+array[i][i];
    
      if(i!=n-1-i/* i!=n-1/2 */)
    {
        System.out.print(array[i][n-i-1]+" ");
        sum2=sum2+array[i][n-i-1];
    }
}
   
   System.out.println("\nThe sum of digonal matrix element is = "+sum1);
    
    
    obj.close();

    }
}
