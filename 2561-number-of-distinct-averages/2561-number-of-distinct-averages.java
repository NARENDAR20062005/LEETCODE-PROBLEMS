class Solution {
    public int distinctAverages(int[] nums) {
        if(nums.length <=1) return 0;
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();

        int left=0,right=nums.length-1;

        while(left<right){
            double avg = (nums[left]+nums[right])/2.0;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
        
    }
}