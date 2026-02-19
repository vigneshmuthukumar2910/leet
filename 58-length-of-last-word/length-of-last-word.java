class Solution {
    public int lengthOfLastWord(String s) {
        int l=0,r=s.length()-1;
       while(r>=0 && s.charAt(r)==' ') r--;
       while(r>=0 && s.charAt(r)!=' ') {
       l++;
       r--;
       }
        return l;
    }
}