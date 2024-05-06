
public class Sub_Array_Kadans 
{
    static void kadans(int array[])
    {
        int currentsum=array[0];
        int maxsum  = array[0];
        //if all are -ve we then output will be zero ;
        for(int i=1;i<array.length;i++)
        {
            currentsum=currentsum+array[i];
            if(currentsum < 0){
                currentsum=0;
            }
            maxsum=Math.max(maxsum,currentsum);
        }
        System.out.println("The max sub array sum is = "+maxsum);
    }
    public static void main(String[] args) 
    {
        int array[]={10,-3,-4,7,6,5,-4,-1};
        kadans(array);
       

    }
    
}