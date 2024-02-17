public class SlidingWindowForMinArrSum {
    public static int findMinSum(int nums[], int target){
        int left = 0;
        int right = 0;
        int sum = nums[0];
        int len = Integer.MAX_VALUE;

        while(left != nums.length-1 || right != nums.length-1){
            if(sum < target){
                right++;

                if(right==nums.length){
                    break;
                }                    
                sum+= nums[right];    
            }else{
                int ans = right - left +1;
                len = Math.min(len, ans);
                sum -= nums[left];
                left++;    
            }
            // if(len==1){
            //     break;
            // }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        // int[] nums = {1, 4, 4};
        // int target = 4;
        // int nums[] = {1, 2, 3, 4, 5};
        // int target = 11;

        System.out.println(findMinSum(nums, target));
    }
}
