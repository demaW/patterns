package com.epam.patterns.template;

public class TemplateMain {
    public static void main(String[] args){
        SysTemFan overlockingCoolingSystem = new Overclock(4);
        overlockingCoolingSystem.launchCoolingSystem();

        System.out.println();

        SysTemFan silentCoolingSystem = new Silent(4);
        silentCoolingSystem.launchCoolingSystem();
    }
}
