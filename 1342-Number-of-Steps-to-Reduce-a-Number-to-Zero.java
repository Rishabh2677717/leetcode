class Solution {
    public int numberOfSteps(int nums) {
        int count =0;
        while(nums>0){
            if(nums%2==0){
                nums/=2;
                count+=1;
            }
            else{
                nums-=1;
                count+=1;
            }
        }
        return count;
    }
}