// import java.util.*;

public class linearSearch{

    public static int linearSearchFun(int arr[],int key){
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]){
        int arr[] ={1,34,2,11,44,66,32};
        int key=11;
        // int key=111;

        int index=linearSearchFun(arr, key);
        
        if(index==-1){
            System.out.println("key not found");
        }
        
        else{
            System.out.println("key found at index:" + index);
        }

    }
}