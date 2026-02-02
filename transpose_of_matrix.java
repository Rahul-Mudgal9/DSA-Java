public class transpose_of_matrix {
    public static void main (String args[]) {
        int arr[][] = {{5, 6, 7},
                       {1, 2, 3},
                       {10, 15, 39},
                       {60, 70, 80}};
        
        int n = arr.length;
        int m = arr[0].length;

        int transpose[][] = new int[m][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
