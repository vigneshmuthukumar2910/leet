class Solution {
    public int trap(int[] height) {
        int left=height[0],n=height.length-1;
        Stack<Integer> right=new Stack();
         right.push(height[n]);
        for(int i=n-1;i>=2;i--){
            int temp=Math.max(right.peek(),height[i]);
            right.push(temp);
        }
        int tot_water=0;
        for(int i=1;i<n;i++){
            int minimum=Math.min(right.peek(),left);
            int temp=minimum-height[i];
            tot_water+=Math.max(0,temp);
            right.pop();
            left=Math.max(left,height[i]);
        }
        return tot_water;
    }
}