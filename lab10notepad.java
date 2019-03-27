public class Lab10 {
 public static void addTo10(int [][] array) {
	int replaceZero = 0;
	 for (int i = 0; i < array.length; i++) {
		 int sum = 0;
		 for (int j = 0; j < array[i].length; j++) {	
			 sum = sum + array[i][j];
		 }
		 replaceZero = 10 - sum; 
		 for (int k = 0; k < array[i].length; k++) {	
			 if(array[i][k] == 0) {
				 array[i][k] = replaceZero; 
			 }
		 }
	 }
 	}
	 
	 /*for (int i = 0; i < array.length; i++) {
		 int sum = 0;
		 for (int j = 0; j < array[i].length; j++) {	
			 sum = sum + array[i][j];
			 }
		 System.out.println(sum + " NEW SUM");
	 }
	
 	}*/
	 
   
   public static void setHints(int [][] array) {
	   for (int i = 0; i < array.length; i++) {
		   for (int j = 0; j < array[i].length; j++) {
			   if (isInBounds(i, j, board) && isBomb(value)) {
				   array[i][j] = array[i][j] + 1;
			   }
	   }
   }
   }
   
   public static boolean isInBounds(int i, int j, int[][] board){
         return (i >= 0 && i < board.length) && (j >= 0 && j < board[i].length);
   }

   public static boolean isBomb(int value){
         return value == -1;
   }

   
   public static void main(String[] args) 
  { 
    
    int [][] matrix = {{-1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, -1, 0, -1}, 
      {0, 0, 0, -1, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int [][] matrix2 = {{6, 3, 2, 0, 4}, {34, 53, 0, 23, 1}, {0, 23, 54, 11, 7}};
    int [][] matrix3 = { { 0, -1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
    addTo10(matrix2);
    setHints(matrix);
    setHints(matrix3);
   
  } 
   
 }