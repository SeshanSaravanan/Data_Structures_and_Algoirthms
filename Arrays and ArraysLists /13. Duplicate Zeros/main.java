class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for (int num : arr){
            if (num == 0){
                zeros++;
            }
        }

        for (int i = n-1; i >= 0; i--){
            if (zeros == 0){
                break;
            }

            if (arr[i] == 0){
                if (i + zeros < n){
                    arr[i + zeros] = 0;
                }
                zeros--;
            }
            if (i + zeros < n){
                arr[i+zeros] = arr[i];
            }
        }
    }
}
