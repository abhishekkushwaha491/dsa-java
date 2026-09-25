class Solution {
    public int inversionCount(int arr[]) {
        // code here
        
        return mergeSort(arr,0,arr.length-1);
       
    }
    
    public static int mergeSort(int[] arr, int si, int ei){
        // Base
        if(si >= ei){
            return 0;
        }
        
        // Recursion
        int mid = si+(ei-si)/2;
        int left = mergeSort(arr,si,mid);  // for left part
        int right = mergeSort(arr,mid+1,ei); // for right part
        
        int mergeCount = merge(arr,si,ei,mid);
        
        return left + right + mergeCount;
    }
    
    public static int merge(int[] arr, int si, int ei, int mid){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        int count = 0;

      // merge element 
        while(i<= mid && j<= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                count += mid-i+1;
                temp[k] = arr[j];
                j++;
            }
            
            k++;
        }

      //  if any element left in left half
        while(i<=mid){
            temp[k++] = arr[i++];
        }

      // if any element left in right half
        while(j<=ei){
            temp[k++] = arr[j++];
        }

      // copy the temp array to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
                arr[i] = temp[k];
            }
        
        
        return count;
    }
}

// Time complexity = O(nlogn)
// Space complexity = O(n)
