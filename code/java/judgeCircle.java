class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.equals(""))
            return true;
        int[] pos = new int[2];
        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c == 'R') pos[0] += 1;
            else if(c == 'L') pos[0] -= 1;
            else if(c == 'U') pos[1] +=  1;
            else if(c == 'D') pos[1] -= 1;
        }
        return (pos[0] == 0 && pos[1] == 0);
    }
}
