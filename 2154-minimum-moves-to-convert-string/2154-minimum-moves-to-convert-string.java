class Solution {
    public int minimumMoves(String s) {
        int i=0,step=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i+=3;
                step++;
            }else{
                i++;
            }
        }
        return step;
    }
}