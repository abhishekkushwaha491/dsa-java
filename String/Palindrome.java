// Time Complexity: O(n)
// Space Complexity: O(1)

/* 
  Approach -> check first and last if they match return true else return false
  
*/

class Solution {
  boolean isPalindrome(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return false; 
      } 
    } 
    return true; 
  } 
}
