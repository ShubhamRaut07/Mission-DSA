// import java.util.*;

public class linearSearchString {

    public static int linearSearchFun(String str[] ,String key){
        for (int i=0 ;i<str.length;i++){
            if(str[i].equals(key)){
                return 1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        String[] arrStr = {"hii","there","I","am","a","string"};
        String key="there";

        int index=linearSearchFun(arrStr, key);

        if(index==-1){
            System.out.println("String not found");
        }
        else{
            System.out.println("String found at index:"+index);
        }

    }
}
