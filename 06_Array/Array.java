public class Array{
    public static void main(String args[]){
        // Method 1: 
        int arr[] = new int[5]; // integer array of size 5 is created into heap
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // Method 2: 
        int arr2[] = {10, 20, 30, 40, 50};
        for(int x: arr2){
            System.out.println(x);
        }
    }
}

// NOTES ****
// - In java every array is created in heap memory
// - If you create a array of size N then it will automatically assign the values as a default values of that data type Ex- for int values are 0 (zero)