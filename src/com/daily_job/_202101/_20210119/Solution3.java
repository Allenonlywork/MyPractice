package com.daily_job._202101._20210119;

import dataStructures.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的后序遍历
 */
public class Solution3 {
    static List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        backSerarch(root);
        System.out.println();
    }

    private static void backSerarch(TreeNode root) {
        if(root == null){
            return;
        }
        backSerarch(root.left);
        backSerarch(root.right);
        res.add(root.val);
    }

}
