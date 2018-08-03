package com.xavier.dp02.step05;

import com.xavier.dp01.step01.Shape;
import com.xavier.dp02.step03.Color;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
