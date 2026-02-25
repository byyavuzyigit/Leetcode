class Solution(object):
    def sortByBits(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        tupleArray = []
        for num in arr:
            tupleArray.append((num, bin(num).count('1')))
        
        mergeSortTupleArray(tupleArray, 0, len(tupleArray)-1)

        for i in range(0, len(tupleArray)):
            arr[i] = tupleArray[i][0]
        
        return [t[0] for t in tupleArray]

def mergeTupleArray(arr, left, mid, right):
    n1 = mid - left + 1
    n2 = right - mid 

    # temp arrays
    L = [(0,0)] * n1
    R = [(0,0)] * n2

    # copy data to temp arrays L and R
    for i in range(n1):
        L[i] = arr[left + i]
    for j in range(n2):
        R[j] = arr[mid + 1 + j]

    i = 0  
    j = 0  
    k = left

    while i < n1 and j < n2:
        # compare based on binaryOneCount
        if L[i][1] < R[j][1]:
            arr[k] = L[i]
            i += 1
        elif R[j][1] < L[i][1]:
            arr[k] = R[j]
            j += 1
        # compare based on the integer
        elif L[i][0] < R[j][0]:
            arr[k] = L[i]
            i += 1 
        else:
            arr[k] = R[j]
            j += 1
        k += 1
    
    # copy the remaining tuples
    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1
    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1

    
def mergeSortTupleArray(arr, left, right):
    if left < right:
        mid = (left + right) // 2
    
        mergeSortTupleArray(arr, left, mid)
        mergeSortTupleArray(arr, mid+1, right)
        mergeTupleArray(arr, left, mid, right)

        