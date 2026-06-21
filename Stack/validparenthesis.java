import java.util.*;
public class  validparenthesis{
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') st.push(')');
            else if (ch == '{') st.push('}');
            else if (ch == '[') st.push(']');
            else {
                if (st.empty() || st.pop() != ch)
                    return false;
            }
        }

        return st.empty();
    }
}
/*import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
           
            else if (st.empty()) {
                return false;
            }
            else {
                char c = st.pop();

               
                if ((ch == '}' && c == '{') ||
                    (ch == ']' && c == '[') ||
                    (ch == ')' && c == '(')) {
                    
                } else {
                    return false;
                }
            }
        }

        return st.empty();
    }
}
*/