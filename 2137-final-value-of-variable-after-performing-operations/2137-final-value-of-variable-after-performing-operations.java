class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String word : operations){
            if(word.equals("X++")||word.equals("++X")){
                x++;
            }else if(word.equals("X--")||word.equals("--X")){
                x--;
            }
        }
        return x;
    }
}