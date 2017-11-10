package com.prebigdata.uma.master.dao;

import com.prebigdata.uma.master.domain.SensorAggregationDTO;
import com.prebigdata.uma.master.domain.SensorMeasureDTO;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.aggregation.AggregationPipeline;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import java.util.Iterator;

import static org.mongodb.morphia.aggregation.Group.average;
import static org.mongodb.morphia.aggregation.Group.grouping;

/**
 * Created by alvarogomez on 9/11/17.
 */
public class SensorMeasureDAO {

    public void insertSensorMeasure(SensorMeasureDTO sensorMeasureToInsert, Datastore connectionReference) {
        BasicDAO<SensorMeasureDTO, ObjectId> basicDAO;

        try {
            basicDAO = new BasicDAO(SensorMeasureDTO.class, connectionReference);
            basicDAO.save(sensorMeasureToInsert);
        } catch (Exception exception) {
            throw exception;
        }
    }

    public SensorAggregationDTO getSensorMeasureWithTemperatureMean(Datastore connectionReference) {
        Query<SensorMeasureDTO> query = null;
        BasicDAO<SensorMeasureDTO, ObjectId> basicDAO;
        SensorMeasureDTO sensorMeasureDTO;
        SensorAggregationDTO sensorAggregationDTO;

        try {
            sensorMeasureDTO = new SensorMeasureDTO();
            sensorAggregationDTO = new SensorAggregationDTO();
            basicDAO = new BasicDAO(SensorMeasureDTO.class, connectionReference);
            query = basicDAO.createQuery();
            query.criteria("networkType").equal("HSDPA");
            AggregationPipeline pipeline = connectionReference.createAggregation(SensorMeasureDTO.class)
                    .match(query)
                    .group(grouping("meanTemperature", average("temperature")));

            Iterator<SensorAggregationDTO> sensorMeasureDTOIterator = pipeline.aggregate(SensorAggregationDTO.class);

            while (sensorMeasureDTOIterator.hasNext()) {
                sensorAggregationDTO = sensorMeasureDTOIterator.next();
            }
            return sensorAggregationDTO;

        } catch (Exception exception) {
            throw exception;
        }
    }
}
