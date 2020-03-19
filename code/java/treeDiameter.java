class Solution {
    public int treeDiameter(int[][] edges) {
        if(edges.length < 2)
            return edges.length;
        int[][] dedges = new int[2*edges.length][2];
        int len = edges.length;
        for(int i=0;i<edges.length;i++){
            dedges[i][0] = edges[i][0];
            dedges[i][1] = edges[i][1];
            dedges[i+len][0] = edges[i][1];
            dedges[i+len][1] = edges[i][0];            
        }
        Set<Integer> start = new HashSet<Integer>();
        start.add(edges[0][0]);
        Res res = new Res();
        res = bfs(dedges,start);
        res = bfs(dedges,res.start);
        return res.count;
    }
    
    public class Res{
        Set<Integer> start;
        int count;
    }
    
        public Res bfs(int[][] edges,Set<Integer> start){
        Set<Integer> lst = new HashSet<Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        int count = 0;
        int[] tmp = new int[edges.length];
        int n=0;
        Res q = new Res();
        while(1 > 0){
                for(int[] e : edges){
                    if((start.contains(e[0])==true) && (visited.contains(e[1]) == false)){
                        lst.add(e[1]);
                        visited.add(e[0]);
                    }
                }
                if(lst.isEmpty() == true){
                    for(int w : start){
                        n = w;
                        break;
                    }
                    start.clear();
                    start.add(n);
                    q.start = start;
                    q.count = count;
                    return q;
                }
                start.clear();
                start.addAll(lst);
                lst.clear();
                count ++;
            }
        }
}
