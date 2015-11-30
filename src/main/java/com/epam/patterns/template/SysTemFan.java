package com.epam.patterns.template;

public abstract class SysTemFan {
    int cores;
    int fanQuantity;
    int fanSpeed;

    public SysTemFan(int cores, int fanSpeed) {
        this.cores = cores;
        this.fanSpeed = fanSpeed;
    }

    protected void fanQuantityCalculation(){
        System.out.println("Algorithm for fan Quantity for " + cores +" cores system");
    }

    protected void fanSpeedSetting(){
        System.out.println("Setting level for fans speed");
    }

    public void launchCoolingSystem(){
        fanQuantityCalculation();
        System.out.println("Fan quantity calculated");
        fanSpeedSetting();
        System.out.println("Fan speed level is: " + fanSpeed);

    }

}
