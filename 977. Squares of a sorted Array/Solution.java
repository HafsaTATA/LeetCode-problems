class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        
        //the [-4,-1,0,3,10] ==> [0,1,3,4,10] that is the order that will be followed even after square
        //so the abs form is what will decide the order ,for that i will compare their abs() value
        
        int left=0;
        int right=n-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[i]=(int)Math.pow(nums[left++], 2);
            }else
                result[i]=(int)Math.pow(nums[right--], 2);
        }

        return result;
    }
}
