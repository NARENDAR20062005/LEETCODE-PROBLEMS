class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return helper(nums,upper)-helper(nums,lower-1);
        
    }
    public long helper(int[] nums,int t){
        long cnt=0;
        int i=0,j=nums.length-1;

        while(i<j){
            if(nums[i]+nums[j]<=t){
                cnt+=(j-i);
                i++;
            }else{
                j--;
            }
        }
        return cnt;
    }
}