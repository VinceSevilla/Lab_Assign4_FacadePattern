public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValetService("BINS534");
        frontDesk.requestRoomCleaning(3);
        frontDesk.requestLuggageCart(7);
    }
}
