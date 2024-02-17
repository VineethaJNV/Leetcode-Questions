import java.util.ArrayList;

public class UniqueElement {
    public static int findUnique(ArrayList<Integer>A){
        // ArrayList<Integer>freq = new ArrayList<>(); //storing frequency
        for(int i = 0 ; i < A.size(); i++){
            int count = 0 ;
            for(int j = 0; j < A.size(); j++){
                if(A.get(i) == A.get(j)){
                    count++;
                }
            }
            if(count == 1){
                return A.get(i);
            }
            // freq.add(i, count);
        }
        // System.out.println(freq);
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 5, 2, 3, 5, 1, 4}; //ans = 2
        ArrayList<Integer>A = new ArrayList<>();

        // int arr[] = {9, 10, 7, 10, 9, 1, 5, 1, 5}; //ans = 7
        for(int i = 0 ; i  < arr.length; i++){
            A.add(arr[i]);
        }
        System.out.println(findUnique(A));
    }
}
