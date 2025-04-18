import java.util.Scanner;
public class matrixadd{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = S.nextInt();
        System.out.println("Enter the number of columns:");
        int col = S.nextInt();

        int mat1[][] = new int [row][col];
        int mat2[][] = new int [row][col];
        int res[][] = new int [row][col];

        System.out.println("Enter the elements of matrix1");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat1[i][j] = S.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix2");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat2[i][j] = S.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("sum of matrices:");
for(int i = 0; i < row; i++){
    for(int j = 0; j < col; j++){
        System.out.print(res[i][j] + "\t");
    }
    System.out.println();


        }
        S.close();

    }
}
