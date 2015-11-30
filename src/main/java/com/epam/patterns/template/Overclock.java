package com.epam.patterns.template;

public class Overclock extends SysTemFan {
    public Overclock(int cores) {
        super(cores, 3000);
    }

    @Override
    public void fanSpeedSetting(){
        System.out.println("Setting level for fans speed. For overlocking");
    }

}
