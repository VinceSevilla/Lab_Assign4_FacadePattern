public class HouseKeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping is cleaning room: " + roomNumber);
    }

    @Override
    public void performService() {
        
    }
}
