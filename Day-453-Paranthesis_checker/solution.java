class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // add your code here
        Stack<Character> st = new Stack<>();
        for (Character ch : x.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty() || st.pop() != '(') {
                    return false;
                }
            } else if (ch == '}') {
                if (st.isEmpty() || st.pop() != '{') {
                    return false;
                }
            } else if (ch == ']') {
                if (st.isEmpty() || st.pop() != '[') {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}