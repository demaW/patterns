package com.epam.patterns.bridge;

public class Employee {
    private int ID;
    private String name;

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void saveData(IDataSaver saver){
        System.out.println("Employee about to be saved with " + saver.getClass().getSimpleName());
        saver.saveEmployeeToDB(this);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
