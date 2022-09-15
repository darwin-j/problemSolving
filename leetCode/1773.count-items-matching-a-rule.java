class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int indexToCheck = 0, count = 0;

        if (ruleKey.equals("type")) {
            indexToCheck = 0;
        } else if (ruleKey.equals("color")) {
            indexToCheck = 1;
        } else {
            indexToCheck = 2;
        }

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).get(indexToCheck).equals(ruleValue)) {
                count++;
            }

        }

        return count;
    }
}