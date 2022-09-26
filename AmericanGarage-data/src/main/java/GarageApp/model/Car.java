package GarageApp.model;

import com.fasterxml.jackson.databind.ser.Serializers;

public class Car extends BaseEntity {
    private CarType carType;
    private CarOwner carOwner;
    private Mechanics mechanics;

    private String carName;
}
