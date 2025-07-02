package Arrays;

import java.util.Scanner;

class AddMatrix {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        Scanner x = new Scanner(System.in);

        // Input matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = x.nextInt();

        // Display matrix A
        System.out.println("Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        // Input matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = x.nextInt();

        // Display matrix B
        System.out.println("Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }

        // Add matrices A and B to get matrix C
        System.out.println("Sum of Matrix A and B (Matrix C):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        x.close();
    }
}
