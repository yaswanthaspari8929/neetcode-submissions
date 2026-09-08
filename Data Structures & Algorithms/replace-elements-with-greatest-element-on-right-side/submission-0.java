class Solution {
    public int[] replaceElements(int[] arr) {
        int arr1[]=new int[arr.length];
        int rmax=-1;
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=rmax;
            rmax=Math.max(rmax,arr[i]);


        }
        return arr1;

        
    }
}