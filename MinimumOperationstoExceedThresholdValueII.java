import java.util.PriorityQueue;

public class MinimumOperationstoExceedThresholdValueII {
     public static boolean equalOrGreaterThanK(int[]nums, int k)
    {
        for(int num : nums)
        {
            if(num < k)
            {
                return false;
            }
        }
        System.out.println("returning true");
        return true;
    }
    public static int minOperations(int[] nums, int k) {
        if(equalOrGreaterThanK(nums, k))
        {
            return 0;
        }
       PriorityQueue<Integer> pq = new PriorityQueue<>();
        int elementsGreterThanOrEqualToKCount = 0;
        for(int num : nums)
        {
            if(num >= k)
            {
                elementsGreterThanOrEqualToKCount++;
            }
            pq.add(num);
        }
        int operations = 0;
        // while(!pq.isEmpty())
        // {
        //     System.out.println(pq.remove());
        // }
        while(!pq.isEmpty())
        {
            int smallest = pq.remove();
            System.out.print(smallest);
            if(smallest >= k)
            {
                System.out.println("returning 0");
                return 0;
            }
            int smaller = pq.remove();
            System.out.print(smaller);
            int valToAdd = smallest * 2 + smaller;
            pq.add(valToAdd);
            operations++;
            if(valToAdd >= k) 
            {
                elementsGreterThanOrEqualToKCount++;
            }
            if(elementsGreterThanOrEqualToKCount == pq.size())
            {
                break;
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        int nums[] = {1000000000,999999999,1000000000,999999999,1000000000,999999999};
        int k = 1000000000;
        System.out.println(minOperations(nums, k));

    }
}
