package GarageApp.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
