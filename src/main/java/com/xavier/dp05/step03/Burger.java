package com.xavier.dp05.step03;

import com.xavier.dp05.step01.Item;
import com.xavier.dp05.step01.Packing;
import com.xavier.dp05.step02.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
