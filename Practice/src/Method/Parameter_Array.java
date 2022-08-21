package Method;

import java.util.Arrays;

public class Parameter_Array {

    public static void addTen(int [] arr){
        for (int i=0; i<arr.length ; i++){
            arr[i] +=10;
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        addTen(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

        System.out.println(Arrays.toString(arr));//11,12,13,14,15

    }
}
