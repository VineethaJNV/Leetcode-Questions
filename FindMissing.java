public class FindMissing {
    public static int findMissing(int arr[]){ // O(N)
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] +1 != arr[i+1]){
                return arr[i] + 1;
            }
        }
        return -1;
    }
    public static int findMissingConstantTime(int arr[], int sum){
        int lastElement = arr[arr.length-1];
        int sum1 = (lastElement* (lastElement+1))/2;
        return sum1 -sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};
        int sum = 22;
        System.out.println("The missing number is: "+findMissing(arr));
        System.out.println("The missing number is: "+findMissingConstantTime(arr, sum));
    }
}
