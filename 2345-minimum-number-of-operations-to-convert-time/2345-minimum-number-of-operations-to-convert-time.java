class Solution {
    public int convertTime(String current, String correct) {
        String[] curr = current.split(":");
        String[] corr = correct.split(":");

        int cur = Integer.parseInt(curr[0])*60 + Integer.parseInt(curr[1]);
        int cor = Integer.parseInt(corr[0])*60 + Integer.parseInt(corr[1]);
        int count =0;

        while(cur + 60 <= cor){
            cur += 60;
            count++;
        }

         while(cur + 15 <= cor){
            cur += 15;
            count++;
        }

         while(cur + 5 <= cor){
            cur += 5;
            count++;
        }

         while(cur + 1 <= cor){
            cur += 1;
            count++;
        }

     return count;   
    }
}