package com.prebigdata.uma.master.dao;

import com.prebigdata.uma.master.domain.SensorMeasureDTO;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * Created by alvarogomez on 9/11/17.
 */
public class SensorMeasureDAO {

    public void insertSensorMeasure(SensorMeasureDTO sensorMeasureToInsert, Datastore connectionReference) {
        BasicDAO<SensorMeasureDTO, ObjectId> basicDAO;

        try {
            basicDAO = new BasicDAO(SensorMeasureDTO.class, connectionReference);
            basicDAO.save(sensorMeasureToInsert);
        } catch(Exception exception) {
            throw exception;
        }
    }
}
