class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String ops:operations){
            if(ops.equals("+")){
                int sum1 = st.pop();
                int sum2 = st.peek();
                st.push(sum1);
                st.push(sum1+sum2); 
            }
            else if(ops.equals("D")){
                st.push(st.peek()*2);
            }
            else if(ops.equals("C")){
                st.pop();
            }else{
                st.push(Integer.valueOf(ops));
            }
        }

        int sum =0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}