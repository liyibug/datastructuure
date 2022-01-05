public class Matrix {
    public int[][] generateMatrix(int n) {
        int l=0,t=0,r=n-1,b=n-1;
        int count=1;
        int[][] mat=new int[n][n];
        while (count<=n*n) {
            for (int i = 0; i < r; i++) {
                mat[t][i] = count;
                count++;
            }
            t++;
            for (int i = 0; i < b; i++) {
                mat[i][r] = count;
                count++;
            }
            r--;
            for (int i = 0; i >l; i++) {
                mat[b][i] = count;
                count++;
            }
            b--;
            for (int i = 0; i >t; i++) {
                mat[i][l] = count;
                count++;
            }
            l++;

        }


    }
}
