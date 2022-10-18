package GarageApp.model;

import GarageApp.model.BaseEntity;
import GarageApp.model.Car;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="visits")
public class CarServiceVisition extends BaseEntity {
    private String description;
    private LocalDate date;
    private Car car;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
