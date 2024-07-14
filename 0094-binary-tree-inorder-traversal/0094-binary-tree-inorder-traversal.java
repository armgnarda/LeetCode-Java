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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Sonuç olarak bir liste döndüreceğimiz için ArrayList Sınıfından yeni bir liste oluşturduk.
        List<Integer> result = new ArrayList<Integer>();
        // Öncelikle ağacımızın kökü olup olmadığını yani boş olup olmadığını kontrol etmemiz gerekiyor.
        if(root != null) {
            // kökümüz varsa artık ağacın sol dallarına ilerleyebiliriz.(tabi var ise)
            if (root.left != null) {
                // var ise değerimizi listemize recursive şekilde ekleyebiliriz.
                result.addAll(inorderTraversal(root.left));
            }
            // sol dalımız yok ise bulunduğumuz kökün değerini ekleriz.
            result.add(root.val);
            // ve artık sağ dalları kontrol etmemiz gerkeiyor.
            if(root.right != null) {
                // var ise yine aynı şekilde ekleriz
                result.addAll(inorderTraversal(root.right));
            }
        }
        // sonuç olarak oluşan listeimizi döndürürüz.
        return result;
    }
}