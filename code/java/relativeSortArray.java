class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        List<Integer> tmp1 = new ArrayList<Integer>();
        List<Integer> tmp2 = new ArrayList<Integer>();
        for(int num:arr1)
            if(findPosition(arr2,num) == -1)
                tmp2.add(num);
            else
                tmp1.add(findPosition(arr2,num));
        Integer[] tmp3 = new Integer[tmp1.size()]; 
        tmp3 = tmp1.toArray(tmp3);

        Arrays.sort(tmp3);
        for(int i=0;i<tmp3.length;i++)
            res[i] = arr2[tmp3[i]];
        Integer[] tmp4 = new Integer[tmp2.size()]; 
        tmp4 = tmp2.toArray(tmp4);
        Arrays.sort(tmp4);
        for(int i=0;i<tmp4.length;i++)
            res[tmp3.length+i] = tmp4[i];
        
        return res;
    }
    
    public int findPosition(int[] arr, int num){
        for(int i=0;i<arr.length;i++)
            if(num == arr[i])
                return i;
        return -1;
    }
}
