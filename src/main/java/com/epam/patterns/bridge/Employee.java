package com.epam.patterns.bridge;

public abstract class Employee {

    protected IDataSaver dataSaver;

    public Employee(IDataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }

    public abstract void saveData();
}
