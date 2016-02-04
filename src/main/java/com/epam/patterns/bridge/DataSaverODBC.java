package com.epam.patterns.bridge;

public class DataSaverODBC implements IDataSaver {

    @Override
    public void saveEmployeeToDB(Employee employee) {
        System.out.println(employee.getClass().getSimpleName() + " saved to ODBC");
    }
}
