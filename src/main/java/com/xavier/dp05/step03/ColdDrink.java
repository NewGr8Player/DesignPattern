package com.xavier.dp05.step03;

import com.xavier.dp05.step01.Item;
import com.xavier.dp05.step01.Packing;
import com.xavier.dp05.step02.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}