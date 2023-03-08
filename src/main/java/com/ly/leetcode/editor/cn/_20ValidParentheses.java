//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 每个右括号都有一个对应的相同类型的左括号。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
//
// Related Topics 栈 字符串 👍 3778 👎 0

package com.ly.leetcode.editor.cn;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@Slf4j
public class _20ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new _20ValidParentheses().new Solution();
        solution.isValid("()");
        log.info("heihei");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character,Character> map=new HashMap<>();
            map.put(')','(');
            map.put('}','{');
            map.put(']','[');
            for (int n = 0; n < s.length(); n++) {
                char c = s.charAt(n);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.size() == 0) {
                        return false;
                    }
                    Character character = map.get(c);//找这个字符对应的左符号
                    if(null == character){
                        return false;
                    }
                    Character pop = stack.pop();
                    if (!character.equals(pop)) {
                        return false;
                    }
                }
            }
            if(stack.size()>0){
                return false;
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}