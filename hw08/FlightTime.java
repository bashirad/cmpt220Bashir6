package hw08;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;



public class FlightTime {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230", new GregorianCalendar(2014, 4, 5, 5, 5, 0),
                new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235", new GregorianCalendar(2014, 4, 5, 6, 55, 0),
                new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237", new GregorianCalendar(2014, 4, 5, 9, 35, 0),
                new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTime());
        System.out.println(itinerary.getTotalFlightTime());
    }
}

class Flight {
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    public String getFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return flightNo;
    }

    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    public GregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(GregorianCalendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getFlightTime() {
        return (int) (arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis()) / 60000;
    }
}

class Itinerary {
    private List<Flight> flights;

    public Itinerary(List<Flight> flights) {
        this.flights = flights;
    }

    public int getTotalTime() {
        return (int) (flights.get(flights.size() - 1).getArrivalTime().getTimeInMillis()
                - flights.get(0).getDepartureTime().getTimeInMillis()) / 60000;
    }

    public int getTotalFlightTime() {
        int time = 0;
        for (Flight flight : flights) {
            time += flight.getFlightTime();
        }
        return time;
    }

}
