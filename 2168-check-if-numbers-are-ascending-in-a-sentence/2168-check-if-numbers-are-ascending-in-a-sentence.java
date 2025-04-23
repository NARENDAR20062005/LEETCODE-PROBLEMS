class Solution {
    public boolean areNumbersAscending(String s) {
        int num = 0;
        for(String ch : s.split(" ")){
            try {
                int n = Integer.parseInt(ch);
                if(n<=num){
                    return false;
                }
                num = n;
            }
            catch(Exception e) {}
        }

        return true;
    }
}