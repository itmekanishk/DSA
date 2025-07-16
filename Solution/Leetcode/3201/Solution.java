class Solution {
    public int maximumLength(int[] nums) {
        int EvenCount=0;
        int OddCount=0;
        int OddEvenCount=0;

        int parity=nums[0]%2;

        for(int i=0;i<nums.length;i++){
            int num=nums[i];

            if(num%2==0){
                EvenCount++;
            }else{
                OddCount++;
            }

            if(parity==num%2){
                OddEvenCount++;
                parity = parity^1;
            }
        }
        return Math.max(EvenCount, Math.max(OddCount, OddEvenCount));
    }
}
