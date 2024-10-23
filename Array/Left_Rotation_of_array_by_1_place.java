public class Left_Rotation_of_array_by_1_place {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int x: arr) System.out.print(x + " ");
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i]; 
        }
        arr[arr.length - 1] = temp;
        System.out.println();
        for(int x: arr) System.out.print(x + " ");
    }    
}
