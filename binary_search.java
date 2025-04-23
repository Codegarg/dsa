import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;



//public class binary_search {
//    public static void main(String[] args) {
//        int[] arr={1,4,5,8,11,14};
//        int k=11;
//        int s=0,e=arr.length-1;
//        boolean flag=false;
//        while(s<=e){
//            int mid=s+(e-s)/2;
//            if(arr[mid]==k){
//                System.out.println(mid+1);
//                flag=true;
//                return;
//            }
//            else if(arr[mid]<k) s=mid+1;
//            else e=mid-1;
//        }
//        if(!flag) System.out.println("-1");
//    }
//}

//public class binary_search {
//    public static void main(String[] args) {
//        System.out.println("Enter size of array: ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter elements: ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("find: ");
//        int k=sc.nextInt();
//        int s=0,e=arr.length-1;
//        boolean flag=false;
//        while(s<=e){
//            int mid=s+(e-s)/2;
//            if(arr[mid]==k){
//                System.out.println(mid+1);
//                flag=true;
//                return;
//            }
//            else if(arr[mid]<k) s=mid+1;
//            else e=mid-1;
//        }
//        if(!flag) System.out.println("-1");
//    }
//}

class bianry_search{
    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first,mid-1, key);
            }else{
                return binarySearch(arr,mid+1, last, key);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 50;
        int last=arr.length-1;
        int result = binarySearch(arr,0,last,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}

