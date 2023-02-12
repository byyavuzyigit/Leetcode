public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //merging the given arrays
        int[] arr = new int[nums1.length+nums2.length];

        for(int i = 0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        int count = 0;
        for(int i = nums1.length;i<arr.length;i++){
            arr[i] = nums2[count];
            count++;
        }

        //bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //checking if the array's length is even or not
        if(arr.length%2 == 0){

            int index = arr.length/2;
            double result = (double) (arr[index]+arr[index-1]);
            return result/2;

        }
        else{

            int index = (int) arr.length/2;
            double result = arr[index];
            return result;
        }
    }
}
