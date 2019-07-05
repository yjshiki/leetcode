class Solution {
    public int[] twoSumII(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] res = new int[2];
        while(i != j)
            if(numbers[i]+numbers[j] == target){
                res[0] = ++i;
                res[1] = ++j;
                return res;
            }
            else if(numbers[i]+numbers[j] < target)
                i++;
            else
                j--;
        return res;
    }
}
