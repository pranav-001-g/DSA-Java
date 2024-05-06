public class Unary_operation {
   public static void main(String arg[]){
     // if we use ++a then it change the value of a in the memory first and then use  the value 
    int a =25;
    int b=++a;
    System.out.println("the value of a is = "+a);
    System.out.println("the value of b is = "+b);
    // so first a will change from 25 to 26 and then this 26 value of a will be given to the b;
    System.out.println("-------------------------------------------------------------------------------");
    //if we use a++ the it will first use the value and the change or increment the value;
    int c=25;
    int d = c++;
    System.out.println("the value of c is = "+c);
    System.out.println("the value of d is = "+d);
    
    // here the value of c is first use then change due to this d will use the vlue of c first then it will change the vlaue;
  
   }
}
