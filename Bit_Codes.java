
public class Bit_Codes {

    static void get_ith_bit(int n,int i)
        {
        int bite=1<<i;
        if((n&bite)==0){
            System.out.println("The bit is zero ");
        }
        else{
            System.out.println("The bit is one ");
        }
        }
//--------------------------------------------------------------------------------------------------------------
    static void set_ith_bit(int n,int i)
        {
            int bite=1<<i;
            System.out.println("Number after changing the bit is "+(bite|n));
        }
//--------------------------------------------------------------------------------------------------------------
    static void clear_ith_bit(int n,int i)
        {
            int bite=~(1<<i);
            System.out.println("Number after clearing the bit is "+(bite&n));
        }
 //--------------------------------------------------------------------------------------------------------------
    static void update_ith_bit(int n,int i,int newbit)
        {
            if(newbit==0){
                clear_ith_bit(n, i);
            }
            else{
                set_ith_bit(n, i);
            }
        }
//--------------------------------------------------------------------------------------------------------------
    static void clear_last_i_bit(int n,int i)
        {
            int bite=~0<<i;
            System.out.println("after clearing the last i bits the number will be : "+(n&bite));

        }
//--------------------------------------------------------------------------------------------------------------
    static boolean is_power_of_two(int n)
        {

        return (n&(n-1))==0;
        }
//--------------------------------------------------------------------------------------------------------------
    static void count_set_bits(int n)
        {
            int count=0;
            while(n>0){
                if((n&1)!=0){
                    count++;
                }
                n=n>>1;
            }
            System.out.println("The total number of set bits in the number are "+count);
        }
//--------------------------------------------------------------------------------------------------------------
    static void clear_range_of_bits(int n,int i,int j)
        {
            int start=(1<<i)-1;
            int end=(~0)<<(j+1);
            int bite=start|end;
            System.out.println("The number after clearing the bit form "+i+" bit to "+j+" bit = "+(bite&n));

        }
//--------------------------------------------------------------------------------------------------------------
   static void fastexpo(int a,int n){
        int sum=1;
        while(n>0){
            if((n&1)!=0){
                sum=sum*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println("The exponentioal will be : "+sum);
   }

public static void main(String[] args) 
        {
        
        // get_ith_bit(10,3);
        // set_ith_bit(16, 1);
        // clear_ith_bit(15,1);
        // update_ith_bit(10, 1, 0);
        // clear_ith_bit(15, 2);
        // System.out.println( is_power_of_two(8));
        // count_set_bits(15);
        // clear_range_of_bits(31, 02, 04);
        // fastexpo(2, 4);


        }
}