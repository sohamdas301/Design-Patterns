package Problems.Car_Rental.Controller;

import Problems.Car_Rental.Vehicles.*;
import Problems.Car_Rental.customers.User;

import java.util.*;

public class UserController {
    Map<VehicleType, List<Vehicle>> vehicles;

    public UserController() {
        this.vehicles = new HashMap<>();
    }

    public void registerVehicle(Vehicle v) {
        List<Vehicle> vehicleList;
        if(v instanceof Car) {
            vehicleList = vehicles.getOrDefault(VehicleType.CAR, new ArrayList<>());
            vehicleList.add(v);
            vehicles.put(VehicleType.CAR, vehicleList);
        } else if(v instanceof Bike) {
            vehicleList = vehicles.getOrDefault(VehicleType.BIKE, new ArrayList<>());
            vehicleList.add(v);
            vehicles.put(VehicleType.BIKE, vehicleList);
        }
    }

    public void book(User user, VehicleType vehicleType, ComfortType comfortType, Date dateFrom, Date dateTo) {
        List<Vehicle> vehicleList = vehicles.get(vehicleType);
//        if(vehicleType == null) return null;

        for(Vehicle vehicle : vehicleList) {
            if(vehicle.getComfortType() != comfortType) continue;
            for(Map.Entry<DateInterval, User> dateIntervalUserMap : vehicle.getBookings().entrySet()) {
                if(dateIntervalUserMap.getKey().getDateFrom().toInstant().isAfter(dateTo.toInstant()) ||
                        dateIntervalUserMap.getKey().getDate_to().toInstant().isBefore(dateFrom.toInstant())) {
//                    return Reservation();
                }
            }
        }
//        return null;
    }

}
