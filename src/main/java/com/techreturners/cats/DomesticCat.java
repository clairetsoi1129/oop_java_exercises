package com.techreturners.cats;

public class DomesticCat extends CommonCat {
    public DomesticCat() {
        super("domestic", 23);
    }

    public String eat() {
        return "Purrrrrrr";
    }

    public String run() {
        return "Domestic Cat is running. Purrrrrrr";
    }
}
