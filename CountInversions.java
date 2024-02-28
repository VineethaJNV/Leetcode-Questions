public class CountInversions {
    public static long getInversions(int arr[], int n) {
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        // int arr[] = {3,2,1};
        // int n = 3;
        int arr2[] = {2,5,1,3,4};
        int n = arr2.length;
        System.out.println(getInversions(arr2, n));
    }
}
