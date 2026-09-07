class Solution {
    public int search(int[] arr, int x) {
        // Traverse the array and return the index when the target is found.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
