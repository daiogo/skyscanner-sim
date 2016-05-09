/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyscanner;

import java.util.ArrayList;
import messages.Flight;
import messages.FlightBooking;
import messages.Hotel;
import messages.HotelBooking;

/**
 *
 * @author Diogo
 */
public class Database {

    private ArrayList<FlightBooking> flightBookings;
    private ArrayList<HotelBooking> hotelBookings;
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    public Database() {
        this.flightBookings = new ArrayList();
        this.hotelBookings = new ArrayList();
        this.flights = new ArrayList();
        this.hotels = new ArrayList();
    }

    public ArrayList<FlightBooking> getFlightBookings() {
        return flightBookings;
    }
    
    public ArrayList<HotelBooking> getHotelBookings() {
        return hotelBookings;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }
}
