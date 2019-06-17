class Solution {
    public int maxArea(int[] height) {
        int MaxArea = 0;
        for(int i=0;i<height.length;i++)
            for(int j = i;j<height.length;j++)
                MaxArea = Math.max(MaxArea,Math.min(height[i],height[j]) * (j-i));
        return MaxArea;
    }
}
