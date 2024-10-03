public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage carts.");
    }

    @Override
    public void performService() {
        requestCart(1);
    }
}
