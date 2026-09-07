class Solution {
    public int missingNumber(int[] num) {
        int n=num.length;

        int total=n*(n+1)/2;

        int sum=0;
        for(int x:num) sum+=x;

        return total-sum;

    }
}