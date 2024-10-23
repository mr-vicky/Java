public class Two_dimentional_array {
    public static void main(String args[]){
        // Method 1: 
        int A[][] = new int[3][4];
        // Accessing the 2D array elements
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        
        // Method 2: 
        int B[][] = {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 2, 2, 2}};
        // Accessing the 2D array elements
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B[0].length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        // Method 3:
        int C[][];
        C = new int[5][4];
        // Accessing the array elements using for loop
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[0].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Accessing the array elements using for each loop
        for(int x[]: C){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
