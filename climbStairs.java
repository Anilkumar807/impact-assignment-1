class Solution {
    public int climbStairs(int n) {
        int a=1;
        int b=1;
        int c;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=2;i<=n+1;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}
