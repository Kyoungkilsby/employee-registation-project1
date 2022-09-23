package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.casefactory.Case;
import com.cydeo.streotype_annotation.config.PcConfig;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import com.cydeo.streotype_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase= container.getBean(Case.class);
        Motherboard theMotherboard= container.getBean(Motherboard.class);
        System.out.println(theMonitor.getSize());
        System.out.println(theCase.getModel());
        System.out.println(theMotherboard.getModel());

        PC myPc5= new PC(theCase,theMonitor,theMotherboard);
       // System.out.println(myPc5);
    }
}
