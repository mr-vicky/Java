public class Method_Overloading_Challenge{
    // Challenge 1
    static int area(int l, int b){
        return l * b;
    }
    static double area(int r){
        return Math.PI * r * r;
    }

    // Challenge 2: 
    static void reverse(int arr[]){
        int temp[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        int j = 0;
        for(int i = arr.length-1; i >= 0; i--){
            arr[j] = temp[i];
            j++;
        }
    }

    static int reverse(int num){
        int res = 0;
        while(num > 0){
            res = res * 10 + num % 10;
            num = num / 10;
        }
        return res;
    }
    public static void main(String args[]){
        // Challenge 1 : Calculate area
        System.out.println(area(2, 4));
        System.out.println(area(2));

        // Challenge 2: Reverse method to reverse a int or array    
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 1234;
        reverse(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(reverse(num));
    }
}