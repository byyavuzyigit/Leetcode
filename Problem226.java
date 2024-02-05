public class Problem226 {

    //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

        public TreeNode invertTree(TreeNode root) {
            recursive(root);
            return root;
        }

        public static TreeNode recursive(TreeNode root){
            //base case
            if(root == null)
                return null;

            TreeNode hold;
            hold = root.right;
            root.right = root.left;
            root.left = hold;

            recursive(root.left);
            recursive(root.right);
            return root;
        }
    }

