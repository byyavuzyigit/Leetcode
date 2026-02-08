# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

def dfs(root):
    if root is None:
        return 0
    
    # check left side of the tree
    left = dfs(root.left)
    # if the left side is unbalanced return -1
    if left == -1:
        return -1
    
    # check right side of the tree
    right = dfs(root.right)
    # if the right side is unbalanced return -1
    if right == -1:
        return -1
    
    # check if the diff. is greater than 1 -> unbalanced
    if abs(left-right) > 1:
        return -1
    
    # tree is balanced, return that node's height
    return max(right, left) + 1

class Solution(object):
    def isBalanced(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        return dfs(root) != -1
        

        