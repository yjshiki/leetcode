class Solution {
    public int findMinDifference(List<String> timePoints) {
        int res = 24*60;
        String s1,s2;
        for(int i=0;i<timePoints.size();i++)
            for(int j=i+1;j<timePoints.size();j++){
                s1 = timePoints.get(i);
                s2 = timePoints.get(j);
                res = Math.min(res,countDistance(s1,s2));
                if(res == 0)
                    return 0;
            }
        return res;
    }
    
    public int countDistance(String s1, String s2){
        String[] l1 = s1.split(":");
        String[] l2 = s2.split(":");
        int h1 = Integer.parseInt(l1[0]);
        int h2 = Integer.parseInt(l2[0]);
        int m1 = Integer.parseInt(l1[1]);
        int m2 = Integer.parseInt(l2[1]);
        int res1 = Math.abs( (h1-h2)*60 + (m1-m2) );
        
        return Math.min(res1,24*60-res1);
        
    }
}
