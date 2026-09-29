class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 0;
        int end = nums.length-1;

        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                arr[i] = nums[start] * nums[start];
                start++;
            }else{
                arr[i] = nums[end] * nums[end];
                end--;
            }
        }

        return arr;
    }
}
