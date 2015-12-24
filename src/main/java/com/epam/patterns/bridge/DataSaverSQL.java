package com.epam.patterns.bridge;

public class DataSaverSQL implements IDataSaver {
    @Override
    public void saveEmployeeToDB(Employee employee) {
        System.out.println("Employee saved to SQL");
    }
}
