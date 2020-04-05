class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        Queue<Integer> tmp = new LinkedList<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == C)
                tmp.add(i);
        }
        int pre = -10000;
        int fore = tmp.poll();
        
        int i = 0;
        while(i < S.length()){
            if (i <= fore){
                res[i] = Math.min(i-pre,fore-i);
                i++;
            }
            else{
                    pre = fore;
                    if(tmp.isEmpty() == false)
                        fore = tmp.poll();
                    else
                        fore = 20000;
                }
            }
        return res;
    }
}
