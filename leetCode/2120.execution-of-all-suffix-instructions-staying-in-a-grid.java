class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int end = n - 1;

        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            int xIndex = startPos[1];
            int yIndex = startPos[0];
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'U') {
                    yIndex--;
                } else if (s.charAt(j) == 'D') {
                    yIndex++;
                } else if (s.charAt(j) == 'R') {
                    xIndex++;
                } else {
                    xIndex--;
                }

                System.out.println(yIndex + " " + xIndex);
                if (xIndex < 0 || yIndex < 0) {
                    break;
                }

                if (xIndex > end || yIndex > end) {
                    break;
                } else {
                    count++;
                }

            }

            result[i] = count;

        }

        return result;
    }
}