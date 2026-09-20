class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        
        int rightMostBit = xor & -xor;
        
        int num1 = 0;
        int num2 = 0;
        
        for(int num : arr){
            if((num & rightMostBit) != 0){
                num1 ^= num;
            }else{
                num2 ^= num;
            }
        }
        
        if (num1 < num2) {
                    return new int[]{num1, num2};
                }

                return new int[]{num2, num1};
    }
}
