class Solution {
    public boolean canFinish(int nm, int[][] arr) {
        int n = arr.length;
        List<List<Integer>> L = new ArrayList<>();
        int[] indeg = new int[nm];
        for(int i=0;i<nm;i++){
            L.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            L.get(arr[i][1]).add(arr[i][0]);
            indeg[arr[i][0]]++;
        }
        int cnt=0;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<nm;i++){
            if(indeg[i]==0){
                minheap.offer(i);
            }
        }
        while(!minheap.isEmpty()){
            int v = minheap.poll();
            cnt++;
            for(int x : L.get(v)){
                indeg[x]--;
                if(indeg[x]==0){
                    minheap.offer(x);
                }
            }
        }
        return cnt==nm;
    }
}