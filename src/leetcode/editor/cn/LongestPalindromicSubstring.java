//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划 
// 👍 2576 👎 0

package leetcode.editor.cn;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            String rs = "";
            int max = 0;
            int length = s.length();
            for (int i = 0; i < length; i++)
                for (int j = i + 1; j <= length; j++) {
                    String tempStr = s.substring(i, j);
                    if (tempStr.length() > max && isPalindromic(tempStr)) {
                        rs = tempStr;
                        max = rs.length();
                    }
                }
            return rs;
        }

        private boolean isPalindromic(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
