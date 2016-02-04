package com.epam.patterns.bridge;

public class MainBridge {
    public static void main(String[] args){
        Employee employee = new Employee(1, "John");
        RankedEmployee rankedEmployee = new RankedEmployee(2, "Nick", "L6");

        DataSaverODBC dataSaverODBC = new DataSaverODBC();
        DataSaverSQL dataSaverSQL = new DataSaverSQL();

        employee.saveData(dataSaverODBC);

        rankedEmployee.saveData(dataSaverSQL);

    }
}
