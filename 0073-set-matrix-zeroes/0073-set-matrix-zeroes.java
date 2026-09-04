class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rows=matrix.length;
        int cols=matrix[0].length;

        boolean firstrows=false;
        boolean firstcols=false;

        //check the first row
        for(int j=0;j<cols;j++){
            if(matrix[0][j]==0){
                firstrows=true;
            }
        }
        //check the first col
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                firstcols=true;
            }
        }

        //check the first element of matrix except first row and forst col
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //set marked rows to zero
        for (int i=1;i<rows;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<cols;j++){
                    matrix[i][j]=0;
                }
            }
        }
        //set marked cols to zero
        for (int j=1;j<cols;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<rows;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstrows){
            for(int i=0;i<cols;i++){
                matrix[0][i]=0;
            }
        }
        if(firstcols){
            for(int j=0;j<rows;j++){
                matrix[j][0]=0;
            }
        }
    }
}
