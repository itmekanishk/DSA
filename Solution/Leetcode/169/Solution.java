class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=nums[0];

        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                element=nums[i];
            }
            else if(element==nums[i]){
                count++;

            }
            else{
                count--;
            } 
        }
        
    
        int count1=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==element){
                count1++;
        }
}
        if(count1>(nums.length/2)){
            return element;
        }

        return -1;   
    }

    
}
