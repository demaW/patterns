package com.epam.patterns.bridge;

public class DataSaverSQL implements IDataSaver {
    @Override
    public void saveEmployeeToDB(IEmployee employee) {
        System.out.println(employee.getClass().getSimpleName() + " saved to SQL");
    }
}
