package com.daily_job._202101._20210111;

/**
 *  树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 依次判断：B的左子树是不是A左子树的子结构、B的右子树是不是A右子树的子结构
 */
public class Solution1 {
    public static void main(String[] args) {
        TreeNode aNode = new TreeNode(7);
        aNode.leftNode = new TreeNode(6);
        aNode.rightNode = new TreeNode(5);
        aNode.leftNode.leftNode = new TreeNode(4);
        aNode.leftNode.rightNode = new TreeNode(3);
        aNode.rightNode.leftNode = new TreeNode(2);
        aNode.rightNode.rightNode = new TreeNode(1);

        TreeNode bNode = new TreeNode(7);
        bNode.leftNode = new TreeNode(6);
        bNode.leftNode.leftNode = new TreeNode(4);
        bNode.leftNode.rightNode = new TreeNode(3);
        System.out.println(hasSubTree(aNode,bNode));
    }
    //判断bNode是否为aNode的子树
    public static boolean hasSubTree(TreeNode aNode,TreeNode bNode){
        if(aNode == null || bNode == null) return false;
        if(aNode.val != bNode.val) return false;
        boolean res = isSubTree(aNode.leftNode,bNode);

        res = res || hasSubTree(aNode.leftNode,bNode);
        res = res || hasSubTree(aNode.rightNode,bNode);

        return res;
    }
    public static boolean isSubTree(TreeNode aNode,TreeNode bNode){
        if(bNode == null) return true;
        if(aNode == null) return false;
        if(aNode.val == bNode.val) return false;

        return isSubTree(aNode.leftNode,bNode.leftNode) && isSubTree(aNode.rightNode,bNode.rightNode);
    }
}

class TreeNode{
    int val;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int val){
        this.val = val;
    }
}
