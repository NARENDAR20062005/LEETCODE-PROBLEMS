class Solution {
    public int minTimeToType(String word) {
        int time=0;
        char st='a';
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int dif=Math.abs(c-st);
            time+=Math.min(dif,26-dif)+1;
            st=c;
        }
        return time;
    }
}