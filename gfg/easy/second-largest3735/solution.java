class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = arr[0];
                int second = Integer.MIN_VALUE;

                for (int i = 1; i < arr.length; i++) {

                    if (arr[i] > first) {
                        second = first;
                        first = arr[i];
                    }
                    else if (arr[i] > second && arr[i] != first) {
                        second = arr[i];
                    }
                }

                return second == Integer.MIN_VALUE ? -1 : second;
    }
}