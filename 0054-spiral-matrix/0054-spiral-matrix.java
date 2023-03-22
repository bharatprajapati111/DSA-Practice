class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int  rowstart =0,colstart=0,rowend= matrix.length-1,colend = matrix[0].length-1;
        int i;
        ArrayList<Integer> list = new ArrayList<>();
        while(colstart<=colend&&rowstart<=rowend){
            //RIGHT
            for(i=colstart;i<=colend;i++){
                list.add(matrix[rowstart][i]);
            }
            rowstart++;
            //DOWN
            for(i=rowstart;i<=rowend;i++){
                list.add(matrix[i][colend]);
            }
            colend--;
            //LEFT
            if(rowstart<=rowend && colstart<=colend){
            for(i=colend;i>=colstart;i--){
                list.add(matrix[rowend][i]);
                
            }
            rowend--;
            }
            //UP
            if(rowstart<=rowend && colstart<=colend){
            for(i=rowend;i>=rowstart;i--){
                list.add(matrix[i][colstart]);
                
            }
                colstart++;
            }

        }
      
        return list;
    }
}