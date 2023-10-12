import java.util.ArrayList;

class Problem48 {
    public void rotate(int[][] matrix) {

        ArrayList<int[]> copy = new ArrayList<>();

        for(int j=0;j<matrix.length;j++){
            int[] cols = new int[matrix.length];
            for(int i=matrix.length-1;i>=0;i--){
                cols[matrix.length-1-i] = matrix[i][j];
            }
            copy.add(cols);
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i] = copy.get(i);
        }

    }
}
