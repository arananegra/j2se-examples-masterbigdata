package com.prebigdata.uma.master.domain;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value = "sensormeasures", noClassnameStored = true)
public class SensorMeasureDTO {

    @Id
    @Property(value = "_id")
    private ObjectId id;

    @Property(value = "androidVersion")
    private String androidVersion;

    @Property(value = "networkType")
    private String networkType;

    @Property(value = "altitude")
    private Double altitude;


    @Property(value = "magneticIntensity")
    private Float magneticIntensity;

    @Property(value = "acceleration")
    private Float acceleration;

    @Property(value = "deviceOperator")
    private String deviceOperator;


    @Property(value = "gsmSignal")
    private Float gsmSignal;

    @Property(value = "temperature")
    private Float temperature;

    @Property(value = "deviceModel")
    private String deviceModel;

    @Property(value = "rotation")
    private Float rotation;

    @Property(value = "longitude")
    private Double longitude;

    @Property(value = "light")
    private Float light;

    @Property(value = "pressure")
    private Float pressure;

    @Property(value = "date")
    private Date date;

    @Property(value = "speed")
    private Double speed;

    @Property(value = "imei")
    private String imei;

    @Property(value = "batteryTemperature")
    private Float batteryTemperature;

    @Property(value = "batteryLevel")
    private Float batteryLevel;

    @Property(value = "xmlns")
    private String xmlns;

    @Property(value = "noise")
    private Float noise;

    @Property(value = "proximity")
    private Float proximity;

    @Property(value = "humidity")
    private Float humidity;

    @Property(value = "latitude")
    private Double latitude;

    @Property(value = "gravity")
    private Float gravity;


    public SensorMeasureDTO() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Float getMagneticIntensity() {
        return magneticIntensity;
    }

    public void setMagneticIntensity(Float magneticIntensity) {
        this.magneticIntensity = magneticIntensity;
    }

    public Float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Float acceleration) {
        this.acceleration = acceleration;
    }

    public String getDeviceOperator() {
        return deviceOperator;
    }

    public void setDeviceOperator(String deviceOperator) {
        this.deviceOperator = deviceOperator;
    }

    public Float getGsmSignal() {
        return gsmSignal;
    }

    public void setGsmSignal(Float gsmSignal) {
        this.gsmSignal = gsmSignal;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public Float getRotation() {
        return rotation;
    }

    public void setRotation(Float rotation) {
        this.rotation = rotation;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Float getLight() {
        return light;
    }

    public void setLight(Float light) {
        this.light = light;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Float getBatteryTemperature() {
        return batteryTemperature;
    }

    public void setBatteryTemperature(Float batteryTemperature) {
        this.batteryTemperature = batteryTemperature;
    }

    public Float getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Float batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Float getNoise() {
        return noise;
    }

    public void setNoise(Float noise) {
        this.noise = noise;
    }

    public Float getProximity() {
        return proximity;
    }

    public void setProximity(Float proximity) {
        this.proximity = proximity;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Float getGravity() {
        return gravity;
    }

    public void setGravity(Float gravity) {
        this.gravity = gravity;
    }

}