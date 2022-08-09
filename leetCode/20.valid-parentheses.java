import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if (st.isEmpty())
                    return false;
                char ch = st.pop();
                if ((it == ')' && ch == '(') || (it == ']' && ch == '[') || (it == '}' && ch == '{'))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();

        // Stack<Character> sStack = new Stack<Character>();
        // for (int i = 0; i < s.length(); i++) {

        // if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
        // sStack.push(s.charAt(i));
        // } else {
        // if (sStack.empty())
        // return false;
        // char c = sStack.peek();
        // // if ((s.charAt(i) == '(' && c == ')') || (s.charAt(i) == '[' && c == ']')
        // || (s.charAt(i) == '{' && c == '}') ) {
        // sStack.pop();
        // } else {
        // return false;
        // }
        // }

        // }

        // return sStack.empty();
    }
}
// @lc code=end
