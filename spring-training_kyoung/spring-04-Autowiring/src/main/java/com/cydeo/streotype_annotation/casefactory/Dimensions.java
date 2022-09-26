package com.cydeo.streotype_annotation.casefactory;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@AllArgsConstructor
@Component
public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions() {
        this.width=10;
        this.height=30;
        this.depth=40;
    }

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
