class Solution {

  // it returns the character
    public boolean isAlphaNum(char ch){
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length()-1;

        while(st < end){
          // if starting index is not character then increase start and continue
            if(!isAlphaNum(s.charAt(st))){
                st++;
                continue;
            }
            // if ending index is not character then decrease end and continue
             if(!isAlphaNum(s.charAt(end))){
                end--;
                continue;
            }
            // if starting character not equal to ending character then return false
            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
}

// Time Complexity --> O(n)
// Space complexity --> O(1)
