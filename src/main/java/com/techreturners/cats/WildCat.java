package com.techreturners.cats;

public abstract class WildCat extends CommonCat{
    public WildCat(int averageHeight) {
        super("wild", averageHeight);
    }

    @Override
    public abstract String eat();
}
