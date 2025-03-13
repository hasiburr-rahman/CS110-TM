public class lab3_pb5 {
    public static void main(String[] args) {
        int[][] array = {
                {39, 27, 11, 42},
                {10, 93, 91, 90},
                {54, 78, 56, 89},
                {24, 64, 20, 65}
        };

        int columnToSort = 3;
        sortArrayByColumn(array, columnToSort);

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void sortArrayByColumn(int[][] array, int columnIndex) {
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                if (array[j][columnIndex] > array[j + 1][columnIndex]) {
                    int[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
