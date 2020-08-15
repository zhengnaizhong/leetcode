# leetcode学习
## IDEA插件配置
配置示例：

![avatar](插件配置.png)

CodeFileName参考：

    $!velocityTool.camelCaseName(${question.titleSlug})
    
CodeTemplate参考：

    ${question.content}
    package leetcode.editor.cn;
    
    public class $!velocityTool.camelCaseName(${question.titleSlug}) {
    
        public static void main(String[] args) {
            Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
        }
        
        ${question.code}
    }
