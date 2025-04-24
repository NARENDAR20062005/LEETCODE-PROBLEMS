class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> SS = new HashMap<>();
        HashMap<Character, Integer> TT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(!SS.containsKey(chs)){
                SS.put(chs,i);
            }
             if(!TT.containsKey(cht)){
                TT.put(cht,i);
            }
            if(!SS.get(chs).equals(TT.get(cht))){
                return false;
            }
        }
        return true;
    }
}