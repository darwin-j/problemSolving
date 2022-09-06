class Solution {
    public List<String> cellsInRange(String s) {

        List<String> result = new ArrayList<String>();
        int max = 0;

        char firstChar = s.charAt(0);
        char secondChar = s.charAt(3);
        // System.out.println(first +" "+ second);

        int firstNum = Integer.parseInt(String.valueOf(s.charAt(1)));
        int secondNum = Integer.parseInt(String.valueOf(s.charAt(4)));
        // System.out.println(firstNum +" "+ secondNum);
        // System.out.println(firstNum + secondNum);
        int firstCharAscii = (int) firstChar;
        int secondCharAscii = (int) secondChar;

        int columns = secondCharAscii - firstCharAscii + 1;
        int rows = (secondNum + 1) - firstNum;

        int totalCells = rows * columns;
        System.out.println(columns + " x " + rows + " = " + totalCells);

        for (int i = 0; i < columns; i++) {
            String columnName = Character.toString((char) firstCharAscii++);

            int rowNum = firstNum;
            for (int j = 0; j < rows; j++) {
                int rowName = rowNum++;
                result.add(columnName + "" + rowName);
            }

        }

        return result;

    }
}