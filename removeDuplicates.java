import java.util.Arrays;

public class removeDuplicates{
    public static int helper( int nums[],int arr[]){
        arr[0] = nums[0];
        int k = 1;
        for(int i = 1 ; i < nums.length; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length; j++){
                if(nums[i] == arr[j]){
                    
                    flag = true;
                }
            }
            
            if(flag == false){
                arr[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        Arrays.fill(expectedNums, -1);
        int k = helper(nums, expectedNums);
        for(int i = 0 ; i < expectedNums.length; i++){
            System.out.print(expectedNums[i]+" ");
        }
        System.out.println();
        return k;
    }
    public static void main(String[] args) {
        // int arr[] = {1,1,2};
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}