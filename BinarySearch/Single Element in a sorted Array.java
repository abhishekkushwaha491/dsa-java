class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right-left)/2;

            boolean isEven;
            if((right-mid)%2==0){
                isEven = true;
            }else{
                isEven = false;
            }

            if(nums[mid] == nums[mid+1]){
                if(isEven){
                    left = mid+2;
                }else{
                    right = mid-1;
                }
            }else{
                if(isEven){
                    right = mid;
                }else{
                    left = mid+1;
                }

            }
        }

        return nums[right];
    }
}
