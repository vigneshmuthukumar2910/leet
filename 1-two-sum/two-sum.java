class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
    int[] out=new int[2];
    HashMap<Integer,Integer> result=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        int diff=target-nums[i];
        if(!result.isEmpty() && result.containsKey(diff))
        {
            out[0]=result.get(diff);
            out[1]=i;
            return out;

        }
        result.put(nums[i],i);
       
    }
    return out;
    }
}