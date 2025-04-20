public class longestSubArr1493 {
    public int longestSubarray(int[] nums) {
        int left=0; 
        int sumZeros=0; 
        int result=0; 
        int sumOnes=0;
        for (int right=0; right<nums.length; right++){
            if (nums[right]==1){
                sumOnes++;
            }
            else {
                sumZeros++;
                while (sumZeros>1 && left < nums.length){
                    if (nums[left]==0){
                         sumZeros--;
                    }
                    else {
                        sumOnes--; 
                    }
                    left++;
                }
            }
            result = Math.max(result,sumOnes);
        }
        return result; 
    }


public static void main(String[] args) {
longestSubArr1493 obj = new longestSubArr1493();
int [] nums = {0,1,1,1,0,1,1,0,1};
System.out.println("DAAAAAAAFNA : " + obj.longestSubarray(nums)); 

}
}