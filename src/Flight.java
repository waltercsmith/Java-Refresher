public class Flight {

    int passengers;
    int seats;

    void add1Passenger(){
        if(passengers < seats)
            passengers += 1;
    }
}
