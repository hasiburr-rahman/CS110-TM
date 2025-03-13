public class lab3_pb3 {
    public static void main(String[] args) {
        int[][] h = {
                     {2, 4, 3, 4, 5, 8, 8},
                     {7, 3, 4, 3, 3, 4, 4},
                     {3, 3, 4, 3, 3, 2, 2},
                     {9, 3, 4, 7, 3, 4, 1},
                     {3, 5, 4, 3, 6, 3, 8},
                     {3, 4, 4, 6, 3, 4, 4},
                     {3, 7, 4, 8, 3, 8, 4},
                     {6, 3, 5, 9, 2, 7, 9}};
        int[] t = new int[h.length];
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < 7; j++) {
                t[i] += h[i][j];
            }
        }
        int[][] r = new int[h.length][2];
        for (int i = 0; i < h.length; i++) {
            r[i][0] = i;
            r[i][1] = t[i];
        }
        for (int i = 0; i < r.length - 1; i++) {
            for (int j = 0; j < r.length - i - 1; j++) {
                if (r[j][1] < r[j + 1][1]) {
                    int[] temp = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < r.length; i++) {
            System.out.println("Employee " + r[i][0] + ": " + r[i][1]);
        }
    }
}