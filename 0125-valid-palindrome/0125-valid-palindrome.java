class Solution {
    public boolean isPalindrome(String s) {
        String a =s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left =0,right=a.length()-1;
        while(left<right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}