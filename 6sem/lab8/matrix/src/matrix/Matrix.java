package matrix;

public class Matrix {
	private int size;
    private int[][] matrix;

    public Matrix(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер матрицы должен быть больше 0");
        }

        this.size = size;
        this.matrix = new int[size][];

        for (int i = 0; i < size; i++) {
            matrix[i] = new int[i + 1]; 
            matrix[i][i] = 1; 
        }
    }

    public void set(int row, int col, int value) {
        checkBounds(row, col);

        if (row < col) {
            matrix[col][row] = value;
        } else {
            matrix[row][col] = value;
        }
    }

    public int get(int row, int col) {
        checkBounds(row, col);

        if (row < col) {
            return matrix[col][row];
        }
        return matrix[row][col];
    }

    private void checkBounds(int row, int col) {
        if (row < 0 || col < 0 || row >= size || col >= size) {
            throw new IndexOutOfBoundsException("Индексы вне допустимого диапазона");
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
