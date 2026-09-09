class Solution {
  public static boolean find(int[] bloomDay, int day, int n, int m, int k) {

    int count = 0;
    int bouquets = 0;

    for (int j = 0; j < n; j++) {

        if (bloomDay[j] <= day) {
            count++;

            if (count == k) {
                bouquets++;
                count = 0;

                if (bouquets == m) {
                    return true;
                }
            }

        } else {
            count = 0;
        }
    }

    return false;
}
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
int max =0;
int min =Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(bloomDay[i],max);
            min = Math.min(min , bloomDay[i]);
        }

        
        int low = min ;
        int high = max;
        if((long)m*k>n){
            return -1;
        }
        while(low<=high){

          int mid = low + (high - low) / 2;
            if (find(bloomDay, mid, n, m, k)) {
                // Possible to make bouquets
                // Try an earlier day
                high = mid - 1;
            } else {
                // Not possible
                // Need more days
                low = mid + 1;
            }

        }
//        for (int i = min; i <=max ; i++) {
//         boolean ans = find(bloomDay, i, n , m,k);
//         if(ans){
//             System.out.println(i);
//             break;
//         }
//        }


return low;
    }
}