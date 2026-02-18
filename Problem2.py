# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        num1 = 0
        num2 = 0
        decimal1 = 0
        decimal2 = 0

        while l1 != None:
            num1 += l1.val*(10**decimal1)
            decimal1 += 1
            l1 = l1.next
        
        while l2 != None:
            num2 += l2.val*(10**decimal2)
            decimal2 += 1
            l2 = l2.next

        sum = num1 + num2

        if sum == 0:
            return ListNode(0, None)

        nodeArray = []
        indexCount = -1

        while sum > 0:
            val = sum % 10
            nodeArray.append(ListNode(val, None))
            indexCount += 1
            if indexCount > 0:
                nodeArray[indexCount-1].next = nodeArray[indexCount]
            sum = sum // 10
        
        return nodeArray[0]

        