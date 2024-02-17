import java.util.ArrayList;

public class LongestIncreasingSubSequence {
    public static int findLIS(int nums[]){
        int LIS = 0;
        for(int i = 0; i < nums.length; i++){
            ArrayList<Integer>list = new ArrayList<>();
            list.add(nums[i]);
            int comparingVal = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                //System.out.println("nums[j] , nums[i] = " + nums[j] +" "+ nums[i]);
                if(nums[j] > comparingVal){
                    list.add(nums[j]);
                    comparingVal = nums[j];
                }
                LIS = Math.max(LIS, list.size());
            }
            for(int k = 0; k <list.size(); k++){
                System.out.print(list.get(k)+" ");
            }
            System.out.println();
        }
        return LIS;
    }
    public static void main(String[] args) {
        // int nums[] = {10,9,2,5,3,7,101,18}; //4
        // int nums[] = {7,7,7,7,7,7,7};//1
        int nums[] = {0,1,0,3,2,3}; //4
        System.out.println(findLIS(nums));

    }
}
