package com.epam.patterns.bridge;

public class RankedEmployee implements IEmployee {

    private int ID;
    private String name;
    private String rank;

    public RankedEmployee(int ID, String name, String rank) {
        this.ID = ID;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public void saveData(IDataSaver dataSaver) {
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
