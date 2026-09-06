class Solution {
    public static int largest(int[] arr) {
        // code here
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]> first){
                first=arr[i];
            }
        }
        return first;
    }
}
