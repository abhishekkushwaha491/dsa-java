/* 
-> Use three pointers i, j, and k for arrays a, b, and c.
-> Since the arrays are sorted, compare the elements at the current pointers.
-> If all three elements are equal, the element is common to all three arrays.
-> Add the common element to the result list only if it is not already present.
-> If a[i] is smaller than either b[j] or c[k], increment i.
-> Otherwise, if b[j] is smaller than either a[i] or c[k], increment j.
-> Otherwise, increment k.
-> Continue until any one of the three arrays is completely traversed.
*/

class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
  
       int i = 0;
       int j = 0;
       int k = 0;
       
       while(i<a.length && j<b.length && k<c.length){
           
           if(a[i] == b[j] && b[j] == c[k]){
               
              if(list.size() == 0 || list.get(list.size() - 1) != a[i]) {
                  list.add(a[i]);
              }
               
               i++;
               j++;
               k++;
           }
           else if(a[i] < b[j] || a[i] < c[k]){
               i++;
           }
           
           else if(b[j] < a[i] || b[j] < c[k]){
               j++;
           }
           else{
               k++;
           }
           
       }
        
        return list;
    }
}
