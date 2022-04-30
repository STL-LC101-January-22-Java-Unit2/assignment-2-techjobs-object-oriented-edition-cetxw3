package org.launchcode.techjobs.oo;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId ++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }


    //Custom toString() ; custom equals() and hashCode() not applicable in this case

    @Override
    public String toString() { return value; }

    //Getters and setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
