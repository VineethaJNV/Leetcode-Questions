public class Combinations77 {
    /*Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
You may return the answer in any order. */
    public static void main(String[] args) {
        int n = 4; int k = 2;

        int nums[] = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = i+1;
        }
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
