package com.daily_job._202101._20210107;

/**
 * 链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 快慢指针
 * 倒数第k个 ：n+1-k
 * 快指针走完全程 1->n,要走n-1步
 * 慢指针走到第n+1-k个,要走n-k步
 * 快指针比慢指针多走 (n-1) - (n-k) = k-1
 * 快指针先走k-1步
 */
public class Solution1 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        int k =2;
        ListNode res = findKthNodeToTail(node,k);
        System.out.println(res.val);
    }
    public static ListNode findKthNodeToTail(ListNode node,int k){
        if(k<0) return null;
        ListNode fast = node;
        ListNode low = node;
        k--;
        while(fast!=null && fast.next!=null){
            if(k<=0){//等k=0 low才开始后移
                low = low.next;
            }
            fast= fast.next;
            k--;
        }
        if(k>0) return null;
        return low;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
