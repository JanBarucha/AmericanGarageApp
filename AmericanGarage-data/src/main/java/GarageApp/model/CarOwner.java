package GarageApp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="owners")
public class CarOwner extends Person {
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="phone_number")
    private String phoneNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Car> cars = new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
