package code401.challenges;

public class BinarySearch {
    public int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;
        int mid;

        while(left <= right){
            mid = (right + left) / 2;
            if(arr[mid] == key){
                return mid;
            }else if(key > arr[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
