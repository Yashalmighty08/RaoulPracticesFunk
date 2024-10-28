Package ______________;
import java.util.Scanner;

public class ClassMatrix {
    private int row, column;  // Made private for encapsulation
    private int[][] matrix;

    public ClassMatrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    // Method to set a value in the matrix
    public void setValue(int rows, int columns, int value) {
        if (rows >= 0 && rows < row && columns >= 0 && columns < column) {
            matrix[rows][columns] = value;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // Getters
    public int getRows() {
        return row;
    }

    public int getColumns() {
        return column;
    }

    public int getValue(int rows, int columns) {
        if (rows >= 0 && rows < row && columns >= 0 && columns < column) {
            return matrix[rows][columns];
        } else {
            System.out.println("Index out of bounds.");
            return -1; // Return a default value or handle it as needed
        }
    }
    public void createMatrix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter each value in the matrix:");
        for (int row = 0; row < this.getRows(); row++) {
            for (int col = 0; col < this.getColumns(); col++) {
                System.out.print("Enter value for row " + row + ", column " + col + ": ");
                int value = scan.nextInt();
                this.setValue(row, col, value);
            }
        }
        scan.close(); // Close the scanner
    }

    // Method to print the matrix
    public void printMatrix() {
        System.out.println("The " + row + "x" + column + " matrix generated from the above input values is:");
        for (int row = 0; row < this.getRows(); row++) {
            for (int col = 0; col < this.getColumns(); col++) {
                System.out.print(this.getValue(row, col) + "\t");
            }
            System.out.println(); // New line for each row
        }
    }
}

class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("The number of rows in this matrix are: ");
        int row1 = scan.nextInt();
        System.out.print("The number of columns in this matrix are: ");
        int col1 = scan.nextInt();

        ClassMatrix myMatrix = new ClassMatrix(row1, col1);
        myMatrix.createMatrix(); // Create the matrix using user input
        myMatrix.printMatrix(); // Print the matrix

        scan.close(); // Close the scanner
    }
}
