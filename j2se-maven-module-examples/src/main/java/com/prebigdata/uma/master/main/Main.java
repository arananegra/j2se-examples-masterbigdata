package com.prebigdata.uma.master.main;

import com.prebigdata.uma.master.bl.ClientBL;
import com.prebigdata.uma.master.bl.ParkingBL;
import com.prebigdata.uma.master.bl.SensorMeasureBL;
import com.prebigdata.uma.master.domain.ClientDTO;
import com.prebigdata.uma.master.domain.ParkingDTO;
import com.prebigdata.uma.master.domain.SensorAggregationDTO;
import com.prebigdata.uma.master.domain.SensorMeasureDTO;
import com.prebigdata.uma.master.domain.searcher.ClientSearcherDTO;
import org.mongodb.morphia.geo.GeoJson;
import org.mongodb.morphia.geo.Point;

import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        //insertSensorMeasure();
        //searchClients();
        //insertSensorMeasure();
        //getNearParkingToPoint();
        //getTemperatureMeanOfSensors();
    }

    public static void getTemperatureMeanOfSensors() throws Exception {
        SensorMeasureBL sensorMeasureBL = new SensorMeasureBL();

        SensorAggregationDTO sensorAggregationDTO = sensorMeasureBL.getSensorMeasureWithTemperatureMean();

        System.out.println("La temperatura media de los sensores es de " + sensorAggregationDTO.getMeanTemperature());
    }
    public static void getNearParkingToPoint() {
        ParkingBL parkingBL = new ParkingBL();
        Point myPoint = GeoJson.point(36.73, -4.41784098744392);
        try {
            List<ParkingDTO> listOfNearParkings = parkingBL.findNearByPoint(myPoint, 500);
            System.out.println("LA LISTA DE PARKINGS CERCANOS AL PUNTO ES: ");
            for (ParkingDTO parkingDTO : listOfNearParkings) {
                System.out.println(parkingDTO.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertSensorMeasure() throws Exception {
        SensorMeasureDTO aSensorToInsert = new SensorMeasureDTO();
        aSensorToInsert.setAltitude(800.0);
        aSensorToInsert.setNetworkType("EDGE");
        aSensorToInsert.setTemperature((float) 30.5);

        SensorMeasureBL sensorMeasureBL = new SensorMeasureBL();

        sensorMeasureBL.insertSensorMeasure(aSensorToInsert);
        System.out.println("Success at insert operation");
    }

    public static void insertClient() throws Exception {
        ClientDTO singleClient = new ClientDTO();
        ClientBL clientBL = new ClientBL();

        singleClient.name = "Tomy";
        singleClient.surname = "Ortega";
        singleClient.city = "Malaga";

        clientBL.insertClient(singleClient);
    }

    public static void searchClients() throws Exception {
        ClientBL clientBL = new ClientBL();
        ClientSearcherDTO clientSearcher = new ClientSearcherDTO();
        List<ClientDTO> clientListFound = null;

        clientSearcher.nameSearchCriteria = "Tomy";

        clientListFound = clientBL.searchClients(clientSearcher);

        if (clientListFound != null) {
            clientListFound.stream().forEach((currentClient) -> {
                System.out.println("Client");
                System.out.println("======");
                System.out.println("ID: " + currentClient.id);
                System.out.println("NAME: " + currentClient.name);
                System.out.println("SURNAME: " + currentClient.surname);
                System.out.println("CITY: " + currentClient.city);
            });
        } else {
            System.out.println("No Records Found!");
        }
    }
}
