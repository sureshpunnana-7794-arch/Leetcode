class Solution {
    public int totalHammingDistance(int[] nums) {
        int h=0;
        for(int i=0;i<31;i++){
            int c=i;
            int z=0,o=0;
            for(int j=0;j<nums.length;j++){
                if((nums[j]>>c&1)==0)
                  z++;
                else
                   o++;
            }
            h+=z*o;
        }
        return h;
    }
}