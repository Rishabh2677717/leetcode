class Solution {
    public static  boolean weCanPlaceBalls(int []position,int mid,int balls){
        int last= position[0];
        int count = 1;
        for (int i = 1; i < position.length; i++) {
            if(position[i]-last>=mid){
                count++;
                last=position[i];
            }
        }
        if(count>=balls){
            return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
     
    
    Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1]-position[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(weCanPlaceBalls(position,mid,m)){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return high;
    }
}