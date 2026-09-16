class Solution {
    public int findUnique(int[] arr) {
        // code here
        
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            count = count^arr[i];
        }
        
        return count;
    }
}


// Basically use XOR because the XOR of samee elemeent return 0 and different element return 1
