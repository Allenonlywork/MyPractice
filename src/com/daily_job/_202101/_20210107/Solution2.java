package com.daily_job._202101._20210107;

/**
 * 反转链表
 */
public class Solution2 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        ListNode pre = reverse(node);
    }

    /**
     * .next是节点之间的连接关系，用于链接节点
     * pre = node 是指针的移动，即将pre节点的指向关系改为指向node节点
     * @param node
     * @return
     */
    public static ListNode reverse(ListNode node){
        ListNode pre = null;
        while(node.next!=null){
            ListNode next = node.next; //用于保存next节点
            node.next = pre; //头节点指向pre节点
            pre = node; //将node节点赋值给pre节点
            node = next; //node指向node下一个节点，即node节点后移
        }
        return pre;
    }
}
