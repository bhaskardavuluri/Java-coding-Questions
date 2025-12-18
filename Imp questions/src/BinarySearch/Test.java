package BinarySearch;

import java.util.Arrays;

public class Test {
    public static int binarysearch(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


        public static void main (String[]args){
            int[] arr = {2, 4, 6, 8, 10,1,3};

            int key = 8;
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
//            System.out.println(arr);
            int result = binarysearch(arr, 0, arr.length - 1, key);
            System.out.println(result);


        }
    }

