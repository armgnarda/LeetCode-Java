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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);

    }
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true; // Her iki düğüm de boşsa, bu simetriktir
        }
        if (t1 == null || t2 == null) {
            return false; // Sadece bir düğüm boşsa, bu simetrik değildir
        }
        return (t1.val == t2.val) // Düğümlerin değerleri eşit mi?
            && isMirror(t1.right, t2.left) // t1'in sağ alt ağacı t2'nin sol alt ağacına eşit mi?
            && isMirror(t1.left, t2.right); // t1'in sol alt ağacı t2'nin sağ alt ağacına eşit mi?
    }
}