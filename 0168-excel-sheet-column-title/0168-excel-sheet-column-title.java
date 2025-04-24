class Solution {
    public String convertToTitle(int cn) {
        StringBuilder result = new StringBuilder();
        
        while(cn>0){
            cn--;

            result.append((char) (cn % 26 + 'A'));
            cn/=26;
        }
        return result.reverse().toString();
    }
}