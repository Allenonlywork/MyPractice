package com.daily_job._202101._20210113;


import dataStructures.binaryTree.TreeNode;

/**
 * 二叉树的镜像
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 *  操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Solution1 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(6);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(1);

        MirrorTree(root);
        System.out.println(123);
    }

    public static void MirrorTree(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        MirrorTree(root.left);
        MirrorTree(root.right);
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;

    }

}
