package com.prebigdata.uma.master.dao;

import com.prebigdata.uma.master.domain.ClientDTO;
import com.prebigdata.uma.master.domain.ParkingDTO;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.geo.Point;
import org.mongodb.morphia.query.Query;

import java.util.List;

public class ParkingDAO {
    public List<ParkingDTO> findNearByPoint(Point point, int maxDistance, Datastore connectionReference) throws Exception {
        BasicDAO<ParkingDTO, ObjectId> basicDAO;
        try {
            basicDAO = new BasicDAO(ParkingDTO.class, connectionReference);
            Query<ParkingDTO> query = basicDAO.createQuery();
            return query.field("geometry").near(point, maxDistance).asList();
        } catch (Exception exception) {
            throw exception;
        }
    }

    public List<ParkingDTO> findInsideByPoint(Point point, Datastore connectionReference) throws Exception {
        BasicDAO<ParkingDTO, ObjectId> basicDAO;
        try {
            basicDAO = new BasicDAO(ParkingDTO.class, connectionReference);
            Query<ParkingDTO> query = basicDAO.createQuery();
            return query.field("geometry").intersects(point).asList();
        } catch (Exception exception) {
            throw exception;
        }
    }
}
