public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int totalLayers = ( n + 1 )/ 2;
        int count = 1;
        for (int layer = 0; layer < totalLayers; layer++){
            // TRAVERSE LEFT TO RIGHT
            for (int index = layer; index < n - layer; index++) 
            	matrix[layer][index] = count++;
            
            //TRAVERSE TOP TO BOTTOM
            for(int index = layer +1; index < (n - layer); index++) 
            	matrix[index][n - layer - 1] = count++;            	
            
            //TRAVERSE RIGHT TO LEFT
            for(int index = layer +1; index < (n - layer); index++) 
            	matrix[n - layer - 1][n - index - 1] = count++;
            
            // TRAVERSE BOTTOM TO TOP
        	for(int index = layer + 1; index < (n - layer - 1); index++) 
        		matrix[n - index - 1][layer] = count++;
        }
        return matrix;
    }
    public static void main(String[] args) {
    		generateMatrix(10);
    }
}

