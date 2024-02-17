public class MinSizeSubArraySum{
    public static int subArrSum(int nums[], int target){
        int length = Integer.MAX_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i < prefix.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                // System.out.println(sum);
                if(sum >= target){
                    length = Math.min(length, j-i+1);
                }
            }
        }
        return length == Integer.MAX_VALUE ? 0:length;
    }
    public static int printSubArray(int nums[], int target){
        int length = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int sum = 0;
                int len = 0;
                for(int k = i; k <= j; k++){
                    len++;
                    System.out.print(nums[k]+" ");
                    sum+=nums[k];
                }
                System.out.println("sum " +sum);
                if(sum >= target){
                    length = Math.min(length, len);
                }
                // System.out.println();
            }
            
        }
        return length == Integer.MAX_VALUE ? 0:length;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //  int[] nums = {1, 4, 4};
        // int target = 4;
        // int[] nums = {1,1,1,1,1,1,1,1};
        // int target = 11;
        // int nums[] = {1, 2, 3, 4, 5};
        // int target = 11;
        System.out.println("length is: " +printSubArray(nums, target));
        System.out.println("length is: " +subArrSum(nums, target));
    }
}