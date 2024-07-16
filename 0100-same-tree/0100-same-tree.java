/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Her iki ağaç da boşsa, aynıdırlar
        if (p == null && q == null) return true;
        
        // Bir ağaç boşsa, diğeri doluysa, aynı değillerdir
        if (p == null || q == null) return false;
        
        // Her iki ağaç da doluysa, kök değerlerini ve alt ağaçlarını karşılaştır
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}