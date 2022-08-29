class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsChar = new char[jewels.length()];

        for (int i = 0; i < jewelsChar.length; i++) {
            jewelsChar[i] = jewels.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < jewelsChar.length; i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewelsChar[i] == stones.charAt(j)) {
                    count++;
                }

            }
        }

        return count;
    }
}