class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int counter = 0;
        for(Character ch: str.toCharArray())
        {
            if(ch=='(')
            {
                counter++;
                st.push(counter);
                ans.add(counter);
            }
            else if(ch==')')
            {
                ans.add(st.pop());
            }
        }
        
        return ans;
    }
};