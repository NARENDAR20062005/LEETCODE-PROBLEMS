class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String word:strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String str = new String(chars);

            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(word);
        }

        return new ArrayList<>(map.values());
        
    }
}