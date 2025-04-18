import java.util.Scanner;
public class MatrixCheck{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = S.nextInt();
        int cols = S.nextInt();

        int[][] matrix = new int[rows][cols]; // fixed typo: 'row' -> 'rows'

        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = S.nextInt(); // this was missing!
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t"); // fixed: use print, not println
            }
            System.out.println();
        }

        if (rows != cols) { // fixed spacing and syntax
            System.out.println("The given matrix is not symmetric.");
        } else {
            boolean symmetric = true;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) { // fixed spacing and syntax
                        symmetric = false;
                        break;
                    }
                }
            }

            if (symmetric) {
                System.out.println("The given matrix is symmetric.");
            } else {
                System.out.println("The given matrix is not symmetric.");
            }
        }
        S.close();
    }
}

