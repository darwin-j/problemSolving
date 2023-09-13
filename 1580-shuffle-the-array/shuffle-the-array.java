class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k =0;
        int j =n;
        int[] result = new int[n*2];
        for(int i=0;i<n*2;i++){
            result[i] = nums[k];
            result[i+1] = nums[j];
            i=i+1;
            k++;
            j++;
        }
        return result;
        
    }
}