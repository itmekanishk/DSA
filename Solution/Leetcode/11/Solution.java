class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int Select_Height=Math.min(height[left],height[right]);
            int width=right-left;
            int area=Select_Height*width;

            maxArea=Math.max(maxArea,area);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }


            
        }
        return maxArea;
        
    }
}
