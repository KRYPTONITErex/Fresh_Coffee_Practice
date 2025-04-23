package OOP_CollectionGPTPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex5FlightBooking {

    public static void main(String[]args){

        BookingSystem bookingSystem = new BookingSystem();

        Flight flight1 = new Flight("FL001", "New York", "Los Angeles", 150);
        Flight flight2 = new Flight("FL002", "Chicago", "Miami", 200);
        bookingSystem.flights.put(flight1.getId(), flight1);
        bookingSystem.flights.put(flight2.getId(), flight2);

        Passenger passenger1 = new Passenger("Alice");
        Passenger passenger2 = new Passenger("Bob");

        bookingSystem.bookingFlight("FL002", passenger1);
        bookingSystem.bookingFlight("FL001", passenger2);

        bookingSystem.displayFlightDetails();
        System.out.println();
        bookingSystem.displayPassengerDetails(passenger1);
        bookingSystem.displayPassengerDetails(passenger2);
    }
}

class Flight{
    private String id, origin, destination;
    int seats;
    int booked = 0;

    public String getId(){return id;}
    public String getOrigin(){return origin;}
    public String getDestination(){return destination;}
    public int getSeats(){return seats;}
    public int getBooked(){return booked;}

    public Flight(String id, String origin, String destination, int seats){
        this.id = id; this.origin = origin; this.destination = destination; this.seats = seats;
    }

}

class Passenger{
    private String name;

    public String getName(){return name;}

    List<String> bookings = new ArrayList<>();

    public Passenger(String name) {
        this.name = name;
    }
}

class BookingSystem{
    Map<String, Flight> flights = new HashMap<>();

    void bookingFlight(String flightId, Passenger passenger){
        Flight flight = flights.get(flightId);
        if(flight != null && flight.booked < flight.seats){
            flight.booked++;
            passenger.bookings.add(flightId);
        }else {
            System.out.println("Flight is full or does not exist.");
        }

    }

    void displayFlightDetails(){
        System.out.println("Flight Details: ");
        for(Flight flight : flights.values()){
            System.out.println("Flight ID: "+flight.getId()+" Origin: "+ flight.getOrigin() +" Destination: "+ flight.getDestination() +" ==> Available Seats: "+(flight.seats-flight.booked));
        }
    }

    void displayPassengerDetails(Passenger passenger){
        System.out.println("Passenger Details for "+ passenger.getName() +" : ");
        for(String flightId : passenger.bookings){
            Flight flight = flights.get(flightId);
            System.out.println("Flight ID: "+flight.getId()+" Origin: "+ flight.getOrigin() +" Destination: "+ flight.getDestination()+"\n");
        }
    }
}