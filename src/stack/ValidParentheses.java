package stack;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (stack.size() == 0){
                stack.push(s.charAt(i));
            }
            else{
                Character topElt = stack.peek();
                if (topElt == '(' && s.charAt(i) == ')'){
                    stack.pop();
                }
                else if (topElt == '{' && s.charAt(i) == '}'){
                    stack.pop();
                }
                else if (topElt == '[' && s.charAt(i) == ']'){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.size() == 0;
    }
}
