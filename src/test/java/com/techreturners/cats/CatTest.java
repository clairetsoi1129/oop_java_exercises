package com.techreturners.cats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse(domesticCat.isAsleep(), "Cat should be awake by default");
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue(domesticCat.isAsleep(), "Cat should be snoozing");
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse(domesticCat.isAsleep(), "Cat should be awake now");
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }

    @Test
    public void checkCheetahHeight() {
        Cat cheetahCat = new CheetahCat();
        assertEquals(1000, cheetahCat.getAverageHeight());
    }

    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat();
        String eat = domesticCat.eat();
        assertTrue(
                ("PurrrrrrrIt will do I suppose".equals(eat) || "Purrrrrrr".equals(eat)),
                "domestic cat may have 2 different sound"
        );
    }

    @Test
    public void testCatRun() {
        Cat domesticCat = new DomesticCat();
        assertEquals("Domestic Cat is running. Purrrrrrr", domesticCat.run());
    }

    @Test
    public void testLionRun() {
        Cat lionCat = new LionCat();
        assertEquals("Lion is running. Roar!!!!", lionCat.run());
    }

    @Test
    public void testCheetahRun() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Cheetah is running. Zzzzzzz", cheetahCat.run());
    }
}
