class Solution {
    public boolean isHappy(int n) {
        Set<Integer> happy = new HashSet<>();
        while(n!=1 && !happy.contains(n)){
            happy.add(n);
            n=squaresum(n);
        }
        return n==1;        
    }
    private int squaresum(int n){
        int sum=0;
        while(n>0)
        {int last=n%10;
        sum +=last*last;
        n/=10;}
        return sum;
    }

}