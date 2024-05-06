import java.util.*;
public class Search_Matrix{
    /*
     the best example of sorted  2D array is :
            10 20 30 40
            15 25 35 45
            27 29 37 48 
            32 33 39 50
    sorted coloum wise as well as row wise;
     */
    public static void main(String arg[]){

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row=obj.nextInt();
        System.out.println("Enter the number of coloums :");
        int col=obj.nextInt();
        int array[][]=new int[row][col];

        System.out.println("Enter the "+(row*col)+" elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=obj.nextInt();
            }
        }
        int i=0,flag=0 ;
        System.out.println("Enter the element to search :");
        int key=obj.nextInt();
        
        if(key<array[0][0]||key>array[row-1][col-1]){
            System.out.println("There is no element present in the array ");
            flag=1;
        }
       

        // searchin algorithum start form here .

        while (col-1 > 0 && i<row-1) {
            int up=array[i][col-1];

            if(key==up){
                System.out.println("The element is at index : ( "+ i +","+ (col-1)+" )");
                flag=1;
                break;
            }
            else if(key>up){
                i++;
            }
            else if(key<up){
                col--; 
            }
           

        }
        if(flag==0){
            System.out.println("There is no element present in the matrix ");
        }
     obj.close();
    }
}