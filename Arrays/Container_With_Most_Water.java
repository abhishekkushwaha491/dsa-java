class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxWater = 0;

        while (start < end) {
          
            int currWater = Math.min(height[start], height[end]) * (end - start);

            maxWater = Math.max(maxWater, currWater);

            // Update pointer
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }

        return maxWater;
    
    }
}
