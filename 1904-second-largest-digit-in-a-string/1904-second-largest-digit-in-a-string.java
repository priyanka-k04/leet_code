class Solution {
    public int secondHighest(String s) {
        Set <Integer> set=new HashSet<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
        /*by default hashmap is in      asending order hence converting into desending order using comparator function*/
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);//converting loop value into character df='d', 'f'
            if(Character.isDigit(c)){
                int digit=c-'0';//converting character digit into digit again using ASCII value     
                if(!set.contains(digit)){
                    pq.add(digit);
                    set.add(digit);
                }
            }
        }
        if(pq.size()<2) return -1;
        pq.poll();//retrieve last element
        return pq.poll();
    }
}