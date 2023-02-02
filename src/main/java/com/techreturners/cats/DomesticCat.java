package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CommonCat {
    public DomesticCat() {
        super("domestic", 23);
    }

    public String eat() {
        return "Purrrrrrr" + getDismissiveMessage();
    }

    private String getDismissiveMessage(){
        return new Random().nextBoolean() ? "It will do I suppose": "";
    }

    public String run() {
        return "Domestic Cat is running. Purrrrrrr";
    }
}
