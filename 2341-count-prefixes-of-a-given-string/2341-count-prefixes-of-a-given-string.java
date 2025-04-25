class Solution {
    public int countPrefixes(String[] words, String s) {
        
        int c=0;

        for(String word:words){
            if(s.startsWith(word)){
                c++;
            }
        }
        return c;
    }
}