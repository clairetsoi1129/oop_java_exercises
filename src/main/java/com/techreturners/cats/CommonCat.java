package com.techreturners.cats;

public abstract class CommonCat implements Cat {
    protected String setting;
    protected boolean isAsleep;

    protected int averageHeight;

    public CommonCat(String setting, int averageHeight) {
        this.setting = setting;
        this.isAsleep = false;
        this.averageHeight = averageHeight;
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public void wakeUp() {
        isAsleep = false;
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public abstract String eat();

    @Override
    public abstract String run();
}
