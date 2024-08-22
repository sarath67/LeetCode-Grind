class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int temp;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                temp=Math.abs(hm.get(nums[i])-i);
                if(temp<=k){
                    return true;
                }
            }
                hm.put(nums[i],i);

        }
        return false;
    }
}