package Method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class addArrays {

    public static void addArrays(int[]arr1,int[]arr2){
        for(int i =0; i<arr1.length ;i++){
            int sum = arr1[i]+ arr2[i];
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int []arr1={1,3,5,7,9};
        int []arr2={2,4,6,8,10};
        addArrays(arr1,arr2);




    }
}
