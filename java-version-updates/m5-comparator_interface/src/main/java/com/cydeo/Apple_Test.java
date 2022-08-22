package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Apple_Test {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(30,Color.GREEN));
        inventory.add(new Apple(10,Color.RED));
        inventory.add(new Apple(20,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);


        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);




        //Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
               inventory
                        .sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));



    }



}
