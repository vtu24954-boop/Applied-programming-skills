class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result =new int[nums.length];
        for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]*nums[i];
        }
        int num=0;
        int tail=nums.length-1;
        for(int pos =nums.length-1;pos>=0;pos--){
            if(nums[num]>nums[tail]){
                result[pos]=nums[num];
                num++;
            } else {
                result[pos]= nums[tail];
                tail--;
            }
        }
        return result;
    }
}