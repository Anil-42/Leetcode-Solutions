class Solution {
    int nodecount;
    int edgecount;
    void dfs(int s, List<List<Integer>> adj,boolean[] visited){
        visited[s]=true;
        nodecount++;
        edgecount+=adj.get(s).size();
        for(int v : adj.get(s)){
            if(visited[v]==false){
                dfs(v,adj,visited);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                edgecount=0;
                nodecount=0;
                dfs(i,adj,visited);

                if(edgecount==(nodecount*(nodecount-1))){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}