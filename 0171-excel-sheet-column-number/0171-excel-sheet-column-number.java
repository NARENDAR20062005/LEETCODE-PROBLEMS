class Solution {
    public int titleToNumber(String ct) {
        int re =0;
        for(char c : ct.toCharArray()){
            re = re * 26 + (c -'A'+1);
        }
        return re;
    }
}