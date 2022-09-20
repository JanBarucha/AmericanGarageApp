package model;

public class Car {
    private long id;
    private CarType carType;
    private CarOwner carOwner;
    private Mechanics mechanics;

    private String carName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
