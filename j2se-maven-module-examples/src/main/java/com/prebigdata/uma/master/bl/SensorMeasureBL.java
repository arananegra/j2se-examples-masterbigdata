package com.prebigdata.uma.master.bl;

import com.prebigdata.uma.master.dao.SensorMeasureDAO;
import com.prebigdata.uma.master.domain.SensorAggregationDTO;
import com.prebigdata.uma.master.domain.SensorMeasureDTO;

public class SensorMeasureBL {

    public void insertSensorMeasure(SensorMeasureDTO sensorMeasureToInsert) throws Exception {
        SensorMeasureDAO sensorMeasureDAO;

        try {
            sensorMeasureDAO = new SensorMeasureDAO();

            sensorMeasureDAO.insertSensorMeasure(sensorMeasureToInsert, ConnectionDB.getDatastore());
        } catch(Exception exception) {
            throw exception;
        }
    }

    public SensorAggregationDTO getSensorMeasureWithTemperatureMean() {
        SensorMeasureDAO sensorMeasureDAO;
        SensorAggregationDTO sensorAggregationDTO;
        try {
            sensorMeasureDAO = new SensorMeasureDAO();
            sensorAggregationDTO = sensorMeasureDAO.getSensorMeasureWithTemperatureMean(ConnectionDB.getDatastore());
            return sensorAggregationDTO;

        } catch (Exception exception){
            throw exception;
        }
    }
}
