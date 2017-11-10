package com.prebigdata.uma.master.domain;

/**
 * Created by alvarogomez on 10/11/17.
 */
public class SensorAggregationDTO {
    private Double meanTemperature;

    public SensorAggregationDTO() {
        this.meanTemperature = null;
    }

    public Double getMeanTemperature() {
        return meanTemperature;
    }

    public void setMeanTemperature(Double meanTemperature) {
        this.meanTemperature = meanTemperature;
    }
}
