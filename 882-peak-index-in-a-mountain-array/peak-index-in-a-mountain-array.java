class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; // Peak is in the right half
            } else {
                right = mid; // Peak is at mid or left half
            }
        }

        return left; // left == right, peak index
    }
}
