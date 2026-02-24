# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumRootToLeaf(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        return dfsPreorder(root, 0)

def dfsPreorder(node, currentVal):
    if node is None:
        return 0
    
    # update currentVal with the node's value
    currentVal = currentVal * 2 + node.val

    if node.left is None and node.right is None:
        # leaf node
        return currentVal
    
    # if not leaf node, continue with it's left and right child
    return dfsPreorder(node.right, currentVal) + dfsPreorder(node.left, currentVal)