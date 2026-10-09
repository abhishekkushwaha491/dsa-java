class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int totalSum = 0;

        // calculate total sum
       for(int i=0;i<cardPoints.length;i++){
        totalSum += cardPoints[i];
       }

        // size is equal to k
        if(cardPoints.length == k){
            return totalSum;
        }

        // window size
       int windowSize = cardPoints.length - k;
       int left = 0;
       int minSum = totalSum;
       int sum = 0;

        // for calculating minsum of window
        for(int right=0;right<cardPoints.length;right++){
            sum += cardPoints[right];
            
            // if (right-left+1) is greater than window size then remove left element
            if((right-left) + 1 > windowSize){
                sum -= cardPoints[left];
                left++;
            }

            if((right - left) + 1 == windowSize){
                minSum = Math.min(minSum, sum);
            }
             
       }
       
       return totalSum-minSum;
    }
}
