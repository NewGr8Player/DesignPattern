package com.xavier.dp02.step06;

import com.xavier.dp01.step02.Circle;
import com.xavier.dp01.step02.Rectangle;
import com.xavier.dp01.step01.Shape;
import com.xavier.dp01.step02.Square;
import com.xavier.dp02.step03.Color;
import com.xavier.dp02.step05.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
