class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length();
        int k=0;
        for(int i=0;i<n;i++){
            if(haystack.charAt(i)==needle.charAt(k)){
                k++;
            }
            else{
                i=i-k;
                k=0;
            }
            if(k==m){
                return i-k+1;
            }
        }
   return -1;
}
}