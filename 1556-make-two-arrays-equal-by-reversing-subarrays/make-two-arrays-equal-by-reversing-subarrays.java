class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n=target.length,m=arr.length;
        if(n!=m){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target,arr);
        
    }
}