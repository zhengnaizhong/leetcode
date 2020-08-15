//实现 strStr() 函数。 
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串 
// 👍 525 👎 0

package leetcode.editor.cn;

public class ImplementStrstr {

    public static void main(String[] args) {
        Solution solution = new ImplementStrstr().new Solution();
        System.out.println(solution.strStr("mississippi", "ississippi"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() > haystack.length()) {
                return -1;
            }
            if ("".equals(needle)) {
                return 0;
            }
            char[] haystackArray = haystack.toCharArray();
            char[] needleArray = needle.toCharArray();
            for (int i = 0; i < haystackArray.length; i++) {
                // 寻找与子串第一个字符匹配的父串index
                if (haystackArray[i] != needleArray[0]) {
                    continue;
                } else {
                    if (needle.length() - 1 == 0) {
                        return i;
                    }
                    // 如果父字符串剩余长度已经不够了，直接return -1
                    if (haystackArray.length - i -1 < needle.length() - 1) {
                        return -1;
                    } else {
                        for (int j = 1; j < needleArray.length; j++) {
                            if (needleArray[j] != haystackArray[i+j]) {
                                break;
                            } else {
                                if (j == needleArray.length - 1) {
                                    return i;
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
