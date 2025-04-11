class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<word.length();i++){
            char each = word.charAt(i);

            if(each != ch && sb.length() == 0){
                st.push(each);
            }else if(each == ch && sb.length()==0){
                st.push(each);
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
            }else{
                sb.append(each);
            }
        } 
        if(sb.length()==0){
            return word;
        }
        return sb.toString();
    }
}