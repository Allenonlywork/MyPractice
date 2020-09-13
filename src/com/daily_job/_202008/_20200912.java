package com.daily_job._202008;

/**
 * 求二叉树的深度
 */
public class _20200912 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return max(root.left.val,root.right.val) + 1;
    }

    public static int max(int a,int b){
        return a>b?a:b;
    }
}
