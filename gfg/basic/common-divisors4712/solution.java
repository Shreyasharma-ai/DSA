class Solution {
    int commDiv(int a, int b) {
        // code here
        int count=0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
};