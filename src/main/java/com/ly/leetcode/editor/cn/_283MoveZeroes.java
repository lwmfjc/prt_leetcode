//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 
//
// 示例 2: 
//
// 
//输入: nums = [0]
//输出: [0] 
//
// 
//
// 提示: 
// 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能尽量减少完成的操作次数吗？ 
//
// Related Topics 数组 双指针 👍 1905 👎 0

package com.ly.leetcode.editor.cn;

import java.util.Arrays;

public class _283MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new _283MoveZeroes().new Solution();
        solution.moveZeroes(new int[]{1,0,0,1,0,3,12});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            if (null == nums || nums.length == 0) {
                return;
            }
            int zeroNum = 0;//记录总共有几个0
            int numIndex = 0;//用来遍历数组
            while (numIndex < nums.length) {
                int num = nums[numIndex];
                if (0 == num) {
                    zeroNum++;
                } else {
                    //如果前面有zeroNum个0,那么只要遍历到非0数，都要往前
                    //移动zeroNum个位置
                    nums[numIndex-zeroNum]=nums[numIndex];
                }
                numIndex++;
            }
            //填充了几个0，后面就补上几个零
            while (zeroNum > 0){
                nums[nums.length-zeroNum] =0;
                zeroNum--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}