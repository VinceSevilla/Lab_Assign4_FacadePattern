public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is picking up the vehicle with plate number: " + plateNumber);
    }

    @Override
    public void performService() {
        
    }
}
