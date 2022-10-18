package GarageApp.model;

import javax.persistence.Entity;

@Entity
public class Mechanics extends Person{
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
