package Problems.Car_Rental;

import Problems.Car_Rental.Controller.UserController;
import Problems.Car_Rental.Vehicles.*;
import Problems.Car_Rental.customers.User;
import Problems.Car_Rental.customers.UserBuilder;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        // Create User
        User user1 = new UserBuilder().setFirstName("Soham").setLastName("Das").build();

        // Create Vehicles
        Vehicle v1 = new Car("MH-15 XY 1234", ComfortType.Economical, 100);
        userController.registerVehicle(v1);
        Vehicle v2 = new Bike("MH-03 AB 5678", ComfortType.Luxurious, 200);
        userController.registerVehicle(v2);

        Date date_from = Date.from(LocalDate.of(2024, 7, 30).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date date_to = Date.from(LocalDate.of(2024, 8, 4).atStartOfDay(ZoneId.systemDefault()).toInstant());
//        System.out.println(date_from);
//        Reservation reservation = userController.book(user1, VehicleType.CAR, ComfortType.Economical, date_from, date_to);
//        Bill bill = new Bill(reservation);
    }
}
