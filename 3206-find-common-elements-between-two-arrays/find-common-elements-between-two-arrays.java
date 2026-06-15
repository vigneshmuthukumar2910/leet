class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int left=0,right=0;
        for(int i:nums1){
            for(int j:nums2){
                if(i==j){
                    left++;
                    break;
                }
            }
        }
        for(int i:nums2){
            for(int j:nums1){
                if(i==j){
                    right++;
                    break;
                }
            }
        }
        return new int[] {left,right};
    }
}