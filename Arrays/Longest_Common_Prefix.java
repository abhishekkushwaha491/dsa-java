class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        // Traverse each character position
        for(int i=0;i<strs[0].length();i++){

            char ch = strs[0].charAt(i);

            // compare this chracter with every other string
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }

            // append same character to stringBuilder
            sb.append(ch);
        }

        return sb.toString();
    }
}
