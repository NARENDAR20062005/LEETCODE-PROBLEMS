class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1);
        }
        while (k-- > 0) {
            int sum = 0;
            for (char digit : num.toString().toCharArray()) {
                sum += digit - '0';
            }
            num = new StringBuilder(String.valueOf(sum));
        }
        return Integer.parseInt(num.toString());
    }
}