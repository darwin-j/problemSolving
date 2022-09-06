class Solution {
    public int balancedStringSplit(String s) {
        char firstChar = 'L';
        char secondChar = 'R';

        int firstCharCount = 0, secondCharCount = 0, splitCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == firstChar) {
                firstCharCount++;
            } else {
                secondCharCount++;
            }

            if (firstCharCount == secondCharCount) {
                splitCount++;
                firstCharCount = 0;
                secondCharCount = 0;
            }
        }

        return splitCount;
    }
}