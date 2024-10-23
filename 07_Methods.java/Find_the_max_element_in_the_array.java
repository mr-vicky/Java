public class Find_the_max_element_in_the_array {
    static int getMax(int A[]){
        int res = A[0];
        for(int i = 1; i < A.length; i++){
            if(res < A[i])
                res = A[i];
        }
        return res;
    }

    public static void main(String args[]){
        int A[] = {1, 2, 3, 4, 909, 5, 6, 7, 8, 90};

        System.out.println(getMax(A));
    }
}