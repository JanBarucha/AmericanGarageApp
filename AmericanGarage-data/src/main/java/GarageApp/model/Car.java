package GarageApp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="car")
public class Car extends BaseEntity {

    private String carName;
    @OneToOne
    private CarType carType;

    @ManyToOne
    @JoinColumn(name="car_owner_id")
    private CarOwner carOwner;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="kolumna_car_mechanics_specja", joinColumns = @JoinColumn(name="carName"),
    inverseJoinColumns = @JoinColumn(name="speciality"))
    private Set<Mechanics> mechanics;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="visits")
    private Set<CarServiceVisition>  visits = new HashSet<>();

    @Transient
    private String noRowInTable;


    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

    public Set<Mechanics> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Set<Mechanics> mechanics) {
        this.mechanics = mechanics;
    }
}
