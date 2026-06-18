class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       return atmost(nums,k)-atmost(nums,k-1); 
    }
    public int atmost(int[] a,int k){
        int res=0,i=0,n=a.length;
        for(int j=0;j<n;j++){
            k-=a[j]%2;
            while(k<0){
                k+=a[i++]%2;
            }
            res+=j-i+1;
        }
        return res;
    }
}