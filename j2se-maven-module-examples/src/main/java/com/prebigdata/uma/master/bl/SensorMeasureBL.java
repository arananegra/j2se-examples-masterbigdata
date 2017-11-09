package com.prebigdata.uma.master.bl;

import com.prebigdata.uma.master.dao.SensorMeasureDAO;
import com.prebigdata.uma.master.domain.SensorMeasureDTO;

/**
 * Created by alvarogomez on 9/11/17.
 */
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
}
