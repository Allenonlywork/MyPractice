package com.daily_job._202101._20210107;

/**
 * 合并两个排序的链表
 * 输入两个单调递增的链表，
 * 输出两个链表合成后的链表，
 * 合成后的链表满足单调不减规则。
 * eg.
 *  node1:1->3->5->7->9
 *  node2:2->4->6->8->10
 *  res:1->2->3->4->5->6->7->8->9->10
 *
 */
public class Solution3 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);
        node1.next.next.next = new ListNode(7);
        node1.next.next.next.next = new ListNode(9);

        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(4);
        node2.next.next = new ListNode(6);
        node2.next.next.next = new ListNode(8);
        node2.next.next.next.next = new ListNode(10);
//        ListNode res = mergeNodes(node1,node2);//非递归
        ListNode res = mergeNodes2(node1,node2);//递归
        while(res!=null){
            System.out.print(res.val);
            if(res.next != null){
                System.out.print("->");
            }
            res = res.next;
        }
    }
    //非递归实现方式
    public static ListNode mergeNodes(ListNode node1,ListNode node2){
        ListNode res = null;
        ListNode temp = null;
        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
                if(res == null){
                    temp = node1;
                    res = temp;
                }else{
                    temp.next = node1;
                    temp = temp.next;
                }
                node1 = node1.next;
            }else{
                if(res == null){
                    temp = node2;
                    res = temp;
                }else{
                    temp.next = node2;
                    temp = temp.next;
                }
                node2 = node2.next;
            }

        }
        if(node1 == null){
            temp.next = node2;
        }
        if(node2 == null){
            temp.next = node1;
        }
        return res;
    }

    //递归实现方式
    public static ListNode mergeNodes2(ListNode node1,ListNode node2){
        if(node1 == null){
            return node2;
        }
        if (node2 == null){
            return node1;
        }
        if(node1.val < node2.val){
            node1.next = mergeNodes2(node1.next,node2);
            return node1;
        }else{
            node2.next = mergeNodes2(node1,node2.next);
            return node2;
        }
    }
}
