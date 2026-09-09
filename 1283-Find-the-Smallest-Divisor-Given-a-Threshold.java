class Solution {
     public static int max(int []arr){
        int max =0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
     public static int sum(int []arr,int mid){
       int  totals= 0;
        int n = arr.length;
       for(int i =0;i<n;i++){
    totals += (double)(arr[i] + mid - 1) / mid;

       }
       return totals;}
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low =1;
        int high = max(nums);
         while(low<=high){
            int mid = (low+high)/2;
            int totalhour= sum(nums,mid);
            if(totalhour<=threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }
    
}