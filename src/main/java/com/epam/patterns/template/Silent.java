package com.epam.patterns.template;

public class Silent extends SysTemFan {
    public Silent(int cores) {
        super(cores, 1000);
    }

    @Override
    public void fanSpeedSetting(){
        System.out.println("Setting level for fans speed. For silent mode");
    }
}
