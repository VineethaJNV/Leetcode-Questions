public class BinSearch {
    public static int binSearch(int arr[], int target){
        int st = 0;
        int end = arr.length-1;
        

        while(st <= end){
            int mid = (st+end) / 2;
            System.out.println(st +" "+ mid +" "+end); //2 1 3 
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {1, 3, 5, 6};
        int arr[] = {1,3};
        int target = 3;
        System.out.println(binSearch(arr, target));
    }
}
