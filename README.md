## 总述
leetcode-idea解题备份 
## idea的LeetCodePlugin插件
### 插件git地址  
git地址: ```https://github.com/shuzijun/leetcode-question```
###  离线安装包备份(配合idea2021.3.2)
```https://github.com/lwmfjc/leetcode-editor/blob/master/plugin/leetcode-editor-8.6(idea2021.3.2).zip```
## idea的LeetCodePlugin插件设置

![img.png](img.png)
1. CodeFileName

   ```text
   _${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})
   ```

2. CodeTemplate

   ```text
   ${question.content}
   package com.ly.leetcode.editor.cn;
   public class _${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug}){
       public static void main(String[] args) {
            Solution solution = new _${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
            
       }
       ${question.code}
   }
   ```

3. TemplateConstant

   ```text
   ${question.title}	题目标题	示例:两数之和
   ${question.titleSlug}	题目标记	示例:two-sum
   ${question.frontendQuestionId}	题目编号
   ${question.content}	题目描述
   ${question.code}	题目代码
   $!velocityTool.camelCaseName(str)	转换字符为大驼峰样式（开头字母大写）
   $!velocityTool.smallCamelCaseName(str)	转换字符为小驼峰样式（开头字母小写）
   $!velocityTool.snakeCaseName(str)	转换字符为蛇形样式
   $!velocityTool.leftPadZeros(str,n)	在字符串的左边填充0，使字符串的长度至少为n
   $!velocityTool.date()	获取当前时间
   ```

   