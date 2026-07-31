class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow = false;
        boolean firstcol = false;
        
        //set the markers for the first row and the first column
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        firstrow = true;
                    }
                    if( j == 0){
                        firstcol = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //replace the inner matrix
        for(int i = 1;i<matrix.length;i++){
            for(int j = 1; j< matrix[0].length;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //last remaining code
        if(firstrow == true){
            for(int j =0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        if(firstcol == true){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
}