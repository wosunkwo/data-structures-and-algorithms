package code401.challeneges;

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

    public int[] deleteShiftArray(int[] arr){
        if(arr.length < 1){
            return null;
        }else{
            int length = arr.length;
            int mid = length / 2 ;
            int newArrCnt = 0;
            int newArr[] = new int[length - 1];

            for(int i = 0; i < arr.length; i++){
                if(i != mid){
                    newArr[newArrCnt] = arr[i];
                    newArrCnt++;
                }
            }
            return newArr;
        }
    }
}
