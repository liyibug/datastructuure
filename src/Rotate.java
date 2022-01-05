public class Rotate {
    public void setZeroes(int[][] matrix) {
        boolean[] a=new boolean[matrix.length];
        boolean[] b=new boolean[matrix[0].length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;i++){
                if (matrix[i][j]==0){
                    a[i]=b[j]=true;
                }


            }
        }

    }
}
