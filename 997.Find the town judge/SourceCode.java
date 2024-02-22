class Solution {
    public int findJudge(int n, int[][] trust) {
        Set<Integer> trusters=new HashSet<>();
        Map<Integer,Integer> trusted=new HashMap<>();
        //setting the ppl who trust others
        int i;
        for(i=0;i<trust.length; i++){
            trusters.add(trust[i][0]);
            trusted.put(trust[i][1],trusted.getOrDefault(trust[i][1],0)+1);
        }
        //finding the judge:
        for(i=1;i<=n;i++){
            if(trusters.add(i) && trusted.getOrDefault(i, 0) == n - 1)
                return i;
        }
        return -1;
    }
}
