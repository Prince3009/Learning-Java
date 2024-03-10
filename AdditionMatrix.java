public class AdditionMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},
                            {5,8,9}};
                            
        int[][] matrix2 = {{1,2,3},
                            {9,2,4}}; 
                            
        //int[][] sum = new int[matrix1.length][]; 
        int[][] sum = {{0,0,0},
                        {0,0,0}};
        
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }      
    }
    
}
