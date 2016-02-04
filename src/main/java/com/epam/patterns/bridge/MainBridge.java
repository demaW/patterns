package com.epam.patterns.bridge;

public class MainBridge {
    public static void main(String[] args){
        DataSaverSQL dataSaverSQL = new DataSaverSQL();

        DataSaverODBC dataSaverODBC = new DataSaverODBC();

        RegularEmployee regularEmployee = new RegularEmployee(1, "John", dataSaverODBC);
        RankedEmployee rankedEmployee = new RankedEmployee(2, "Nick", "L6", dataSaverSQL);

        regularEmployee.saveData();

        rankedEmployee.saveData();

    }
}
