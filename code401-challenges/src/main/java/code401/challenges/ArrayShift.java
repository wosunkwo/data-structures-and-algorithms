package code401.challenges;

public class ArrayShift {
    public int[] insertShiftArray(int[] arr, int value){
        int length = arr.length;
        int mid = Math.round( (float) length / 2 );
        int arrCnt = 0;
        int newArr[] = new int[length + 1];

        for(int i = 0; i < newArr.length; i++){
            if(i == mid){
                newArr[i] = value;
            }else{
                newArr[i] = arr[arrCnt];
                arrCnt++;
            }
        }
        return newArr;
    }
}
