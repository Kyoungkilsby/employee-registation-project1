package com.cydeo.casefactory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dimensions {

    private int width;
    private int height;
    private int depth;

    @Override
    public String toString() {
        return "Dimensions{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
