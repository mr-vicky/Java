import java.lang.*;

class Copying_an_array{
    public static void main(String args[]){
        int A[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int B[] = new int[10];
        
        for(int i = 0; i < A.length; i++){
            B[i] = A[i];
        }

        for(int x: B) System.out.print(x + " ");
    }
}