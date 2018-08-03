package com.xavier.dp02.step06;

import com.xavier.dp01.step01.Shape;
import com.xavier.dp02.step03.Color;
import com.xavier.dp02.step04.Blue;
import com.xavier.dp02.step04.Green;
import com.xavier.dp02.step04.Red;
import com.xavier.dp02.step05.AbstractFactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
