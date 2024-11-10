import java.util.Arrays;

public class frequencyOfMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {

        int res = 1;
        int start = 0;
        int end = 0;
        long sum = 0;

        Arrays.sort(nums);

        while (end < nums.length) {
            sum += nums[end++];
            
            if (k + sum < ((long)nums[end - 1] * (end - start))) {
                sum -= nums[start++];
                
            }
            res = Math.max(res, end - start);
        }

        return res;
    }
}