import java.util.*;

public class rotateMatrix90{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
        
        // transpose the matrix using iterative
        for(int i = 0; i  < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        
        // swaping rows
        for(int i =0; i < matrix.length; i++)

        {
            for(int j = 0; j < (matrix.length)/2; j++)
            {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length-1-j];
                    matrix[i][matrix.length - 1 -j] = temp;   
            }
            System.out.println();
        }

        System.out.println(" Rotated Matrix:");

        for(int i =0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.err.println();
        }   
    }
}
