package vehicles;

public interface HasFarePassengers extends HasPassengers {
    double computeFare(String destination);
}
