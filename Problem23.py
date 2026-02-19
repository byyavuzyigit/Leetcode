# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[Optional[ListNode]]
        :rtype: Optional[ListNode]
        """
        while len(lists) > 1:
            merged_lists = []
            for i in range(0, len(lists), 2):
                # check the boundry
                if i + 1 < len(lists):
                    merged_lists.append(mergeTwoLists(lists[i], lists[i+1]))
                else:
                    merged_lists.append(lists[i])
            lists = merged_lists
        return None if len(lists) == 0 else lists[0]
        
def mergeTwoLists(list1, list2):
    dummyHead = ListNode()
    curr = dummyHead

    while list1 and list2:
        if list1.val < list2.val:
            curr.next = list1
            list1 = list1.next
        else:
            curr.next = list2
            list2 = list2.next
        curr = curr.next
    
    if list1:
        curr.next = list1
    elif list2:
        curr.next = list2
    
    return dummyHead.next
        