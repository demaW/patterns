package com.epam.patterns.bridge;

public class RegularEmployee extends Employee {
    private int ID;
    private String name;

    public RegularEmployee(int ID, String name, IDataSaver dataSaver) {
        super(dataSaver);
        this.ID = ID;
        this.name = name;
    }

    public void saveData() {
        System.out.println(this.getClass().getSimpleName() + " about to be saved with " + dataSaver.getClass().getSimpleName());
        dataSaver.saveEmployeeToDB(this);
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
