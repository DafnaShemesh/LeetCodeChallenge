public class subarraySum360 {
    public int subarraySum(int[] nums, int k) {
        int ans=0; 
        Map<Integer,Integer> map = new HashMap<>(); 
        map.put(0,1);
        int currentSum=0; 
        for (int i=0; i<nums.length;i++){
            currentSum+=nums[i]; 
            if (map.get(currentSum-k)!=null){
                ans+=map.get(currentSum-k); 
            } 
            map.put(currentSum, map.getOrDefault(currentSum,0)+1); 
        }
        return ans;   
        }
}
