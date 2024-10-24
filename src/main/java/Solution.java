import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> zeroIndexes = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (zeroIndexes.isEmpty()) continue;

                nums[zeroIndexes.poll()] = nums[i];
                nums[i] = 0;
            }

            zeroIndexes.offer(i);
        }
    }
}