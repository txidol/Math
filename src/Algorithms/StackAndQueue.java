package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackAndQueue {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        char[] vars = s.toCharArray();
        for (char var : vars){
            if(map.containsKey(var)){
                stack.push(var);
            }else{
                if( stack.empty() || var != map.get(stack.peek())) {
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.empty();

    }


    public boolean isValid2(String s) {
        int n = s.length();
        char[] stk = new char[n+10];
        int tt = 0;
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if(c == '(') stk[++tt] = ')';
            else if(c == '[') stk[++tt] = ']';
            else if(c == '{') stk[++tt] = '}';
            else if(tt == 0 || stk[tt--] != c) return false;
        }
        return tt == 0;
    }

}


