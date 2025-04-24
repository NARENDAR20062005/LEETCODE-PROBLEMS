class Solution {
    public String capitalizeTitle(String title) {
        String str = title.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(String word : str.split(" ")){
            if(word.length()<=2){
                sb.append(word);
            }else{
               
                for(int i=0;i<word.length();i++){
                    char ch = word.charAt(i);
                    if(i==0){
                        sb.append(Character.toUpperCase(ch));
                        continue;
                    }
                    sb.append(ch);
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}