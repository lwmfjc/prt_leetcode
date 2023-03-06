//给定一个已排序的链表的头
// head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,1,2]
//输出：[1,2]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,1,2,3,3]
//输出：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围 [0, 300] 内 
// -100 <= Node.val <= 100 
// 题目数据保证链表已经按升序 排列 
// 
//
// Related Topics 链表 👍 949 👎 0

package com.ly.leetcode.editor.cn;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class _Eight3RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {
         Solution solution = new _Eight3RemoveDuplicatesFromSortedList().new Solution();
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(1);
        ListNode node3=new ListNode(2);
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(3);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        solution.deleteDuplicates(node1);
        //System.out.println(node1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(null == head || head.next ==null){
            return head;
        }
        ListNode curNode=head;
        //遍历链表
        while (curNode!=null ){
            //为了判断当前节点和下一个节点是否相等
            //下一个节点为空就跳出判断(链表遍历结束)
            if(curNode.next==null){
                break;
            }
            //循环遍历,当前节点和下一个节点是否相等
            //加while是考虑3个以上重复节点的缘故,直到当前节点
            //和下一个节点的值不相等(或者没有下一个节点了)
            while (null != curNode.next && curNode.val == curNode.next.val){
                curNode.next=curNode.next.next;
            }
            curNode=curNode.next;

        }

        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}