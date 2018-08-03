package com.xavier.dp02.step07;

import com.xavier.dp02.step05.AbstractFactory;
import com.xavier.dp02.step06.ColorFactory;
import com.xavier.dp02.step06.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
