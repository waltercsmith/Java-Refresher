package com.pluralsightandreview;

public class Flight {

    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    private int seats;

    public Flight(){
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger(){
        if(passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    private void handleTooMany(){
        System.out.println("Too many");
    }

    public boolean hasRoom(Flight f2){
        int total = this.passengers + f2.passengers;

        return total <= seats;
    }



}
