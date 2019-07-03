package code401.challenges.quickSort;

import java.util.Arrays;

public class QuickSort {

    public void quickSortFunc(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int position = partition(arr, left,right);

            quickSortFunc(arr, left, position - 1);
            quickSortFunc(arr, position + 1, right);
        }
    }

    public int partition(int arr[], int left, int right)
    {
        int pivot = arr[right];
        int low = left - 1;
        for(int i = left; i < right; i++)
        {
            if(arr[i] <= pivot)
            {
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low + 1);
        return low + 1;
    }

    public void swap(int[] arr, int i, int low)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args){
        QuickSort test = new QuickSort();
        int[] arr = {8,3,5,7,9,2,9,1};
        int right = arr.length;
        test.quickSortFunc(arr, 0, right-1);
        System.out.println(Arrays.toString(arr));
    }





//
//    void sort(int arr[], int low, int high)
//    {
//        if (low < high)
//        {
//            int pi = partition(arr, low, high);
//
//            sort(arr, low, pi-1);
//            sort(arr, pi+1, high);
//        }
//    }
//
//    public int partition(int arr[], int low, int high)
//    {
//        int pivot = arr[high];
//        int i = (low-1);
//        for (int j=low; j<high; j++)
//        {
//
//            if (arr[j] <= pivot)
//            {
//                i++;
//
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        int temp = arr[i+1];
//        arr[i+1] = arr[high];
//        arr[high] = temp;
//
//        return i+1;
//    }

//    public int partition(int arr[], int left, int right)
//    {
//        int pivot = arr[right];
//        int low = left - 1;
//        for(int i = left; i < right; i++)
//        {
//            if(arr[i] <= pivot)
//            {
//                low++;
//                int temp = arr[low];
//                arr[low] = arr[i];
//                arr[i] = temp;
//                //swap(arr, i, low);
//            }
//        }
//        //swap(arr, right, low + 1);
//        int temp = arr[low + 1];
//        arr[low + 1] = arr[right];
//        arr[right] = temp;
//
//        return low + 1;
//    }



    // Driver program
//    public static void main(String args[])
//    {
//        int arr[] = {8,3,5,7,9,2,9,1};
//        int n = arr.length;
//
//        QuickSort ob = new QuickSort();
//        ob.quickSortFunc(arr, 0, n-1);
//
//        System.out.println(Arrays.toString(arr));
//        //printArray(arr);
//    }
}
//}
