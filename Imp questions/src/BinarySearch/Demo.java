package BinarySearch;

import java.util.Arrays;

public class Demo {
    public static int binarysearch(int arr[],int low,int high,int key){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<key){
                low=mid+1;

            } else if (arr[mid]==key) {
                return  mid;
            }else{
                high = mid - 1;
            }
            }
        return -1;
        }

    public static void main(String[] args) {
        int[] arr={-10,20,-30,40,22,10};
        int key=-10;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result=binarysearch(arr,0,arr.length-1,key);
        System.out.println(result);
    }
    }

