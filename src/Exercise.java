
public class Exercise {
    public static void main(String[] args) {


        int[] arr = {67, 23, 45, 66, 66, 11, 67, 48, 67, 88, 90, 667, 44, 55, 77, 12, 11, 23, 33, 44, 55, 111, 2222, 23, 15, 67};
//	quickSort(arr, 0, arr.length-1);
//	bubbleSort(arr);
//	selectSort(arr);
        insertSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }


//快速排序

    static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int i = begin;
            int j = end;
            int key = arr[begin];
            while (i < j) {
                while (i < j && arr[j] >= key)
                    j--;
                arr[i] = arr[j];
                while (i < j && arr[i] <= key)
                    i++;
                arr[j] = arr[i];
            }
            arr[i] = key;
            quickSort(arr, begin, i - 1);
            quickSort(arr, i + 1, end);
        }
    }


//冒泡排序：


    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

//选择排序

    static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

//插入排序

    static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
