class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> st = new Stack<>();
        int val =1;
        int i=0;
        ArrayList<String> sb = new ArrayList<>();

        while(i<target.length){
            st.push(val);
            sb.add("Push");
            if(target[i]==val){
                val++;
                i++;
            }else{
                st.pop();
                sb.add("Pop");
                val++;
            }
        }
        return sb;
    }
}