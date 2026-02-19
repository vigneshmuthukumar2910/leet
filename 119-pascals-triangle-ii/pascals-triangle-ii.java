class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascal= new ArrayList<>();
        pascal.add(1);
        int prev,cur=0;
        for(int i=0;i<rowIndex;i++){
            prev=1;
            for(int j=1;j<=i;j++){
                cur=pascal.get(j);
                pascal.set(j,prev+cur);
                prev=cur;
            }
            pascal.add(1);
        }
        return pascal;
    }
    }