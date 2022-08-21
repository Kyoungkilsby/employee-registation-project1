package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,8,7,1,3);
        Collections.sort(list);
        System.out.println(list);

      Collections.sort(list,new MyComparator());
        System.out.println(list);

       Collections.sort(list, ((o1, o2) ->(o1<o2)? -1 :(o1>o2)? 1 : 0 ));

       //Ascending order
        list.sort((o1,o2)-> o1.compareTo(o2));
        System.out.println(list);

        //Descending order

        list.sort((o2,o1) ->o1.compareTo(o2));
        System.out.println(list);



    }
}
