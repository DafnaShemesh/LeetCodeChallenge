public class MaximumAvgSubArr643{

    public double findMaxAverage(int[] nums, int k) {
        double avg =0;
        double sum=0; 
        for (int i=0; i<k; i++){
            sum+=nums[i]; 
        }
        avg= sum/(double)k; 
        int right = k; 
        for (int left=1; right<nums.length; left++){
            sum+= ( nums[right] - nums[left-1]);
            avg = Math.max(avg, (sum/(double)k)); 
            right ++; 
        }
        return avg; 
    }

    public static void main(String[] args) {
        MaximumAvgSubArr643 obj = new MaximumAvgSubArr643(); 
        int [] nums = {1,12,-5,-6,50,3}; 
        int k = 4; 
        System.out.println(obj.findMaxAverage(nums, k)); // 12.75
    }
    
}