import java.util.*;
public class Spiral_matrix {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int er=obj.nextInt();
        System.out.println("Enter the number of coloums :");
        int ec=obj.nextInt();
        int array[][]= new int[er][ec];
        System.out.println("Enter the "+er*ec+" elements in the array :");
        for(int i=0;i<er;i++){
            for(int j=0;j<ec;j++){
                array[i][j]=obj.nextInt();
            }
        }
        int sc=0,sr=0;
        ec--;er--;
        while(sc<=ec && sr<=er){
            for(int i=sc;i<=ec;i++){
                System.out.print(array[sc][i]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(array[i][ec]+" ");
            }
            for(int i=ec-1;i>=sc;i--){
                if(sr==er){
                    break;
                }
                System.out.print(array[er][i]+" ");
           }
           for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(array[i][sc]+" ");
           }

        sc++;
        sr++;
        ec--;
        er--;
obj.close();
    }
    
}
}
