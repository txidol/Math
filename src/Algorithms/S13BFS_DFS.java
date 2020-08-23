package Algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class S13BFS_DFS {

    //广度优先
    public List<List<Integer>> levelOrderBFS(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new ArrayDeque<>(); //双端队列
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // Java 的 pop 写作 poll()
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i =0;i<size;i++){
                TreeNode remove = queue.poll();
                list.add(remove.val);
                if (remove.left != null) {
                    queue.add(node.left);
                }
                if (remove.right != null) {
                    queue.add(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public int minDepth(TreeNode root){
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left ==0 || right==0)
                ? left+right+1
                : Math.min(left,right)+1;
    }

    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return  Math.max(left,right)+1;
    }





}
