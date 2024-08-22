class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int temp=0;
        int m=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=sum-1;
            }
            else{
                sum=sum+1;
            }
            if(sum==0){
                temp=i+1;
                if(temp>m){
                    m=temp;
                }
            }
            if(hm.containsKey(sum)){
                temp=i-hm.get(sum);
                if(temp>m){
                    m=temp;
                }
            }
            else if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return m;
    }
}