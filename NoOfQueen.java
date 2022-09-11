
import java.util.*;
public class NoOfQueen {
  



    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);

        
    }
    public static boolean issafe(int r ,int c , int[][]chess){
        for(int i = r;i>=0;i--){
            if(chess[i][c]==1){
                return false;
            }
        }
        
        for(int i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--){    
            if(chess[i][j]==1){
                return false;
            }
        }

        for(int i = r-1, j = c+1; i >= 0 && j <chess[0].length; i--, j++){
            if(chess[i][j]==1){
                return false;
            }

        }
        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){

            System.out.println(qsf+".");
            return;
        }

        for(int col = 0; col<chess.length;col++){
            if(issafe(row,col,chess)){
                chess[row][col] = 1;
                printNQueens(chess, qsf +" " +row+"-" +col+ ",", row+1);
                chess[row][col] = 0;
            }

        }
    }
}

