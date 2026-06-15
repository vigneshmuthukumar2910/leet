class Solution {
    public List<Integer> intersection(int[][] nums) {
        int frq[] =new int[1001];
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                frq[nums[i][j]]++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(frq[i]==len){
                list.add(i);
            }
            
        }
        return list;
    }
}