public class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0){
            for(int i=0;i<nums2.length;i++){
                nums1[i] = nums2[i];
            }
        }
        if(n==0){
            return;
        }
        int count = 0;
        // merging the arrays
        for(int i=m;count<n;i++){
            nums1[i] = nums2[count];
            count++;
        }

        // sorting the array
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length-1;j++){
                if(nums1[j]>nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }


    }
}
