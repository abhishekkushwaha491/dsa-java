class Solution {
    public int findPosition(int n) {
        // code here
        int i = 0;
        int count = 0;
        
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
            
            i++;
        }
        
        if(count != 1){
            return -1;
        }
        
        return i;
    }
}

// if lsb is 1 then count++ otherwise continue
// for position I take a variable i which increase always so when i got 1 it's correct position is i
// but i have to return i when only 1 set bit is available so i check it then i return
