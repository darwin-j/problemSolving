class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == indices[j]) {
                    chArr[i] = s.charAt(j);
                }
            }

        }

        String result = new String(chArr);

        return result;
    }
}