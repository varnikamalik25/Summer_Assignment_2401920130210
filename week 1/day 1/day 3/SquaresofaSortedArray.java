class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[]result= new int[n];
        int left= 0;
        int right= n-1;
        int index= n-1;
        while(left<=right){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if (leftsq > rightsq){
                result[index] = leftsq;
                left++;
            }else{
                result[index] = rightsq;
                right--;
            }
            index--;
        }
        return result;
    }
}
