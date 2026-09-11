class Solution {
      public static boolean ship(int[] weights, int capacity, int days) {

        int usedDays = 1;
        int sum = 0;

        for (int num : weights) {

            if (sum + num <= capacity) {
                sum += num;
            } else {
                usedDays++;
                sum = num;
            }
        }

        return usedDays <= days;
    }

    public int splitArray(int[] nums, int k) {
        
 int low = Integer.MIN_VALUE;        // maximum element
        int high = 0;// total sum
         for (int num : nums) {
            high += num;
            low =Math.max(low,num);
        }
 while (low <= high) {

            int mid = low + (high - low) / 2;

            if (ship(nums, mid,k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
return low;


    }
}