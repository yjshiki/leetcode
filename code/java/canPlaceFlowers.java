class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;
        int i = 0;
        int count = 1;
        while(i < flowerbed.length){
            if(flowerbed[i] == 0)
                count += 1;
            else{
                total += Math.max((count-1)/2,0);
                count = 0;
            }
            i = i + 1;
        }
        if(count != 0)
            total += count/2;
        

        return total >= n;
    }
}
