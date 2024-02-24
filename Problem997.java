class Problem997 {
    public int findJudge(int n, int[][] trust) {
        int[] trusting = new int[n+1];
        int[] trusted = new int[n+1];
        for(int i=0;i<trust.length;i++){
            trusting[trust[i][0]]++;
            trusted[trust[i][1]]++;
        }
        for(int i=1;i<n+1;i++){
            if(trusted[i] == n-1 && trusting[i] == 0)
                return i;
        }
        return -1;
    }
}
