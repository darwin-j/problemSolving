class Solution {
    public int mostWordsFound(String[] sentences) {

        int maxWords = 0;
        int count;

        for (int i = 0; i < sentences.length; i++) {
            count = 0;
            for (char c : sentences[i].toCharArray()) {
                if (Character.isWhitespace(c)) {
                    count++;
                }
            }

            if (count > maxWords) {
                maxWords = count;
            }
        }

        return maxWords + 1;
    }
}