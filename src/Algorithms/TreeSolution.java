package Algorithms;

public class TreeSolution {

    public boolean isValidBST(TreeNode root) {
        return helperBSTRecursive(root,null,null);
    }

    public boolean helperBSTRecursive(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (! helperBSTRecursive(node.right, val, upper)) return false;
        if (! helperBSTRecursive(node.left, lower, val)) return false;
        return true;
    }

    long pre = Long.MIN_VALUE; // 记录上一个节点的值，初始值为Long的最小值
    // 中序遍历
    public boolean inorder(TreeNode node) {
        if(node == null) return true;
        boolean l = inorder(node.left);
        if(node.val <= pre) return false;
        pre = node.val;
        boolean r = inorder(node.right);
        return l && r;
    }

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root == null || root ==p || root ==q ) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right =lowestCommonAncestor(root.right,p,q);
        return left ==null? right : right == null? left :root;
    }


    public TreeNode lowestCommonAncestorBSTRecursive(TreeNode root,TreeNode p,TreeNode q){
        if(root.val < p.val &&  root.val < q.val )
            lowestCommonAncestorBSTRecursive(root.right,p,q);
        if(root.val > p.val &&  root.val > q.val )
            lowestCommonAncestorBSTRecursive(root.left,p,q);
        return root;
    }

    public TreeNode lowestCommonAncestorBST(TreeNode root,TreeNode p,TreeNode q){
        while( root != null){
            if(root.val < p.val &&  root.val < q.val ){
                root = root.right;
            }else if(root.val > p.val &&  root.val > q.val ){
                root = root.left;
            }else{
                return root;
            }
        }
        return root;
    }




}
