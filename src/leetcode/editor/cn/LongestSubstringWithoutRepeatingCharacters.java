//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4170 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        solution.lengthOfLongestSubstring("");
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            List<Integer> integerList = new ArrayList<>();
            char[] sArray = s.toCharArray();
            for (int i = 0; i < sArray.length; i++) {
                int count = 1;
                List<Character> characterList = new ArrayList<>();
                characterList.add(sArray[i]);
                for (int j = i + 1; j < sArray.length; j++) {
                    if (!characterList.contains(sArray[j])) {
                        characterList.add(sArray[j]);
                        count++;
                    } else {
                        break;
                    }
                }
                integerList.add(count);
            }
            integerList.sort(Integer::compareTo);
            return integerList.get(integerList.size() - 1);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
