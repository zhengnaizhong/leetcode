//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。 
//
// 示例 1： 
//
// 输入: s = "leetcode"
//输出: false 
// 
//
// 示例 2： 
//
// 输入: s = "abc"
//输出: true
// 
//
// 限制： 
// 
// 0 <= len(s) <= 100 
// 如果你不使用额外的数据结构，会很加分。 
// 
// Related Topics 数组 
// 👍 46 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class IsUniqueLcci {

    public static void main(String[] args) {
        Solution solution = new IsUniqueLcci().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isUnique(String astr) {
            // 使用map
            /*Map<String, Object> countMap = new HashMap<>();
            char[] aStrArray = astr.toCharArray();
            for (char temp : aStrArray) {
                if (countMap.get(String.valueOf(temp)) == null) {
                    countMap.put(String.valueOf(temp), new Object());
                } else {
                    return false;
                }
            }
            return true;*/
            // 不使用数据结构
            char[] aStrArray = astr.toCharArray();
            for (int i = 0; i < aStrArray.length; i++) {
                for (int j = i + 1; j < aStrArray.length; j++) {
                    if (aStrArray[i] == aStrArray[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
