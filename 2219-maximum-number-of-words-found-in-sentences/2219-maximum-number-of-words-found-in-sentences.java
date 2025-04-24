class Solution {
    public int mostWordsFound(String[] sentences) {
        int min=1;
        
        for(String str : sentences){
            int count = 1;
            for(char ch : str.toCharArray()){
                if(ch == ' '){
                    count +=1;
                }
            }
            if(count>min){
                min = count;
            }
        }
        return min;
    }
}