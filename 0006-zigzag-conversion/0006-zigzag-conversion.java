class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int diff = 2*(numRows-1);
        int diag = diff;
        int secindex,index;

        for(int i=0;i<numRows;i++){
            index =i;
        
        while(index<n){
            sb.append(s.charAt(index));
            if(i !=0 && i != numRows-1){
                diag = diff-2*i;
                secindex =index+diag;

                if(secindex <n){
                    sb.append(s.charAt(secindex));

                }
            }
            index += diff;
     }
        }
        return sb.toString();
    }
}