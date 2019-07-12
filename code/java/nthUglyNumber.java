class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> ugly = new ArrayList<Integer>();
        ugly.add(1);
        int index = 1;
        int f = 1;
        int f2=2,f3=3,f5=5,index2=1,index3=1,index5=1;
        while(index < n){
            f = Math.min(Math.min(f2,f3),f5);
            ugly.add(f);
            index++;
            if(f==f2)
                f2 = 2*ugly.get(index2++);
            if(f==f3)
                f3 = 3*ugly.get(index3++);
            if(f==f5)
                f5 = 5*ugly.get(index5++);
        }
        return f;
    }
}
