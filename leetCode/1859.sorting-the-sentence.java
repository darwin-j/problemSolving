class Solution {
    public String sortSentence(String s) {

        String[] getWords = s.split(" ");

        // System.out.println(getWords[0]);

        String[] sortedStringArr = new String[getWords.length];

        for (int i = 0; i < getWords.length; i++) {
            int number = Integer.parseInt(String.valueOf(getWords[i].charAt(getWords[i].length() - 1)));
            // System.out.println(number);

            sortedStringArr[number - 1] = getWords[i].replace(number + "", "");

        }

        return String.join(" ", sortedStringArr);

    }
}