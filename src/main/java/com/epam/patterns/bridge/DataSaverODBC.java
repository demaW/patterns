package com.epam.patterns.bridge;

public class DataSaverODBC implements IDataSaver {

    @Override
    public void saveEmployeeToDB(Employee employee) {
        System.out.println("Employee saved to ODBC");
    }
}
