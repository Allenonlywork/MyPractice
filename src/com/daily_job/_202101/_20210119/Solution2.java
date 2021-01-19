package com.daily_job._202101._20210119;

import dataStructures.binaryTree.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> list = serarchTree(root);
        for(Integer i:list){
            System.out.print(i);
        }
    }

    private static List<Integer> serarchTree(TreeNode root) {
        //遍历返回结果序列
        List<Integer> list = new ArrayList<>();
        //辅助遍历队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            //从队列中弹出一个节点，并添加到返回结果集
            TreeNode node = queue.poll();
            list.add(node.val);
            //将弹出节点的左子树节点加入队列
            if(node.left != null){
                queue.offer(node.left);
            }
            //将弹出节点的右子树节点加入队列
            if(node.right != null){
                queue.offer(node.right);
            }
        }
        return list;
    }

}
