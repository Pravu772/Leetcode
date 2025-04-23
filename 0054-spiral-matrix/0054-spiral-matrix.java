class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int rowlower=0;
        int collower=0;
        int rowupper=matrix.length-1;
        int colupper=matrix[0].length-1;
        while(rowlower<=rowupper && collower<=colupper){
            for(int i=collower;i<=colupper;i++){
                result.add(matrix[rowlower][i]);
            }
            rowlower++;
            for(int i=rowlower;i<=rowupper;i++){
                result.add(matrix[i][colupper]);
            }
            colupper--;
            if(rowlower>rowupper || collower>colupper){
                break;
            }
            for(int i=colupper;i>=collower;i--){
                result.add(matrix[rowupper][i]);
            }
            rowupper--;
            for(int i=rowupper;i>=rowlower;i--){
                result.add(matrix[i][collower]);
            }
            collower++;
            
        }
        return result;
    }
}