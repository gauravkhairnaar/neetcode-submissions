class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = ans(n);
        }
        return true;
    }
    private int ans(int n){
        int total = 0;
        while(n>0){
            int last = n%10;
            total+=last*last;
            n/=10;
        }
        return total;
    }
}
