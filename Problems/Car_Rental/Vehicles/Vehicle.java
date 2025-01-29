package Problems.Car_Rental.Vehicles;

import Problems.Car_Rental.customers.User;

import java.util.Map;
import java.util.TreeMap;

public abstract class Vehicle {
    //Keep the list sorted so that search can be log(n)
    private Map<DateInterval, User> bookings;
    private String vehicleNumber;
    private ComfortType comfortType;
    private double pricePerDay;

    public Vehicle(String vehicleNumber, ComfortType comfortType, double pricePerDay) {
        this.bookings = new TreeMap<DateInterval, User>();
        this.vehicleNumber = vehicleNumber;
        this.comfortType = comfortType;
        this.pricePerDay = pricePerDay;
    }

    public Map<DateInterval, User> getBookings() {
        return bookings;
    }

    public void setBookings(Map<DateInterval, User> bookings) {
        this.bookings = bookings;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerday(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public ComfortType getComfortType() {
        return comfortType;
    }

    public void setComfortType(ComfortType comfortType) {
        this.comfortType = comfortType;
    }
}
