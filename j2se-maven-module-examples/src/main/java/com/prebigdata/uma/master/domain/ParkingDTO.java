package com.prebigdata.uma.master.domain;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.geo.Polygon;

/**
 * Created by alvarogomez on 9/11/17.
 */
@Entity(value = "parkings", noClassnameStored = true)
public class ParkingDTO {

    @Id
    @Property(value="_id")
    private ObjectId id;

    @Property(value="name")
    private String name;

    @Property(value="geometry")
    private Polygon geometry;

    public ParkingDTO() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Polygon getGeometry() {
        return geometry;
    }

    public void setGeometry(Polygon geometry) {
        this.geometry = geometry;
    }
}