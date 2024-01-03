class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(arr[i] == i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}