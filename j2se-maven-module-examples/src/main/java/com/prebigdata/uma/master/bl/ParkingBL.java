package com.prebigdata.uma.master.bl;

import com.prebigdata.uma.master.dao.ParkingDAO;
import com.prebigdata.uma.master.dao.SensorMeasureDAO;
import com.prebigdata.uma.master.domain.ParkingDTO;
import com.prebigdata.uma.master.domain.SensorMeasureDTO;
import org.mongodb.morphia.geo.Point;

import java.util.List;

/**
 * Created by alvarogomez on 9/11/17.
 */
public class ParkingBL {

    public List<ParkingDTO> findNearByPoint(Point point, int maxDistance) throws Exception {
        ParkingDAO parkingDAO;
        try {
            parkingDAO = new ParkingDAO();
            List<ParkingDTO> listOfParkingsFinds = parkingDAO.findNearByPoint(point, maxDistance, ConnectionDB.getDatastore());
            return listOfParkingsFinds;
        } catch (Exception exception) {
            throw exception;
        }
    }

    public List<ParkingDTO> findInsideByPoint(Point point) throws Exception {
        ParkingDAO parkingDAO;
        try {
            parkingDAO = new ParkingDAO();
            List<ParkingDTO> listOfParkingsFinds = parkingDAO.findInsideByPoint(point, ConnectionDB.getDatastore());
            return listOfParkingsFinds;
        } catch (Exception exception) {
            throw exception;
        }
    }
}
