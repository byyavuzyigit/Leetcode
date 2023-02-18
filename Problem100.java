public class Problem100 {

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


        public boolean isSameTree(TreeNode p, TreeNode q) {
            return recursive(p,q);
        }

        public static boolean recursive(TreeNode p, TreeNode q){

            if(p==null && q==null)
                return true;

            if(p==null || q==null || p.val!=q.val)
                return false;

            return recursive(p.left,q.left) && recursive(p.right,q.right);
        }
    }

