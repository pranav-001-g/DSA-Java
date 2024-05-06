public class N_Queen {
    static int count =0;
    static void print(char chess[][]){
        System.out.println("------------------ Chess-Board ------------------");
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[0].length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
            // exit();
        }
    }
    static boolean isSafe(char chess[][],int row,int col)
    {
        //vertical up
        int i=row-1;
        int j=col;
        while(i>=0){
            if(chess[i][col]=='Q'){
                return false;
            }
            i--;
        }

        //cross left
        i=row-1;
        j=col-1;
        while(i>=0 && j>=0){
            if(chess[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }

        //cross right
        i=row-1;
        j=col+1;
        while(i>=0 && j<chess[0].length){
            if(chess[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }

        return true;
    }
    static boolean allPossibleWays(char chess[][],int row){

        if(row==chess.length){
            count++;
            // print(chess);
            return true;
        }
        for(int j=0;j<chess[0].length;j++){
            if(isSafe(chess,row,j)){
            chess[row][j]='Q';
           if( allPossibleWays(chess, row+1)){
            return true;
           }
            // chess[row][j]='X';
            
            }
        }
        return false;
    }
    public static void main(String arg[]){
        int row=5;
        int col=5;
        char chess[][]=new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                chess[i][j]='X';
            }
        }
      if(  allPossibleWays(chess,0)){
        System.out.println("Total posiable solutions are : "+ count);
        print(chess);
      }
    else{
        System.out.println("Tot");

    }
    }
}
