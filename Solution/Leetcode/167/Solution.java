class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            int sum = low+high;
            if(sum==target){
                return new int[] {low+1,high+1};
            }
            else if(sum<target){
                low++;
            }
            else{
                high--;
            }
        
        }
        return new int[] {-1,-1};
    }
}
