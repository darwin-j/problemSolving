class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth =0;
        for(int[] customer:accounts){
            int sum=0;
            for(int banksBalence:customer){
                sum = sum + banksBalence;
            }
            if(maxWealth<sum){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}