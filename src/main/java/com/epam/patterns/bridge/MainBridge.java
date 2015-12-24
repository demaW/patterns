package com.epam.patterns.bridge;

public class MainBridge {
    public static void main(String[] args){
        Employee employee = new Employee(1, "John");

        DataSaverODBC dataSaverODBC = new DataSaverODBC();
        DataSaverSQL dataSaverSQL = new DataSaverSQL();

        employee.saveData(dataSaverODBC);

        employee.saveData(dataSaverSQL);

    }
}
