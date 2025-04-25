class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len =0;

        while(s.length() % k != 0){
            s+=fill;
        }

        String res[] = new String[s.length() / k];
        int i=0;
        int j=0;

        while(i<s.length()){
            String str = s.substring(i,i+k);
            res[j++]=str;
            i+=k;
            //j++;
        }
        return res;
    }
}