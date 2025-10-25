class Solution {
    public int totalMoney(int n) {
        int first=28;
        int term =n/7;
        int last=first+(term-1)*7;
        int result=term*(first+last)/2;

        int remain=n%7;
        int f=1+term;
        int l=f+remain-1;
        result+=remain*(f+l)/2;
        return result;

        
    }
}