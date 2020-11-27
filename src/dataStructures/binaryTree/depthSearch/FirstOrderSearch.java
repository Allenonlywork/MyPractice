package dataStructures.binaryTree.depthSearch;

import dataStructures.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FirstOrderSearch {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(5);
        TreeNode left3 = new TreeNode(6);
        TreeNode right3 = new TreeNode(7);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        right1.left = left3;
        right1.right = right3;
        List<Integer> res = preOrderTraversal(root);
        for(int i:res){
            System.out.print(i);
        }
    }

    public static List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preOrderTraversal(root,res);
        return res;
    }
    public static void preOrderTraversal(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        preOrderTraversal(root.left,res);
        preOrderTraversal(root.right,res);
    }
}
